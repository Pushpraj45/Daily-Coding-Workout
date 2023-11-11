class Solution {
    public int countKDifference(int[] nums, int k) {
        /* Brute Force
        int ans = 0;
        for(int i =0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(Math.abs(nums[i] - nums[j]) == k){
                    ans++;
                }
            }
        }
        return ans;
        */ 

        // Optimized one
        HashMap<Integer, Integer> map = new HashMap<>();

        int ans = 0;
        for(int num : nums){
            if(map.containsKey(num-k)){
                ans+=map.get(num-k);
            }
            if(map.containsKey(num+k)){
                ans+=map.get(num+k);
            }

            // Update freq of current element 
            map.put(num, map.getOrDefault(num,0)+1);
        }
        return ans;        
    }
}