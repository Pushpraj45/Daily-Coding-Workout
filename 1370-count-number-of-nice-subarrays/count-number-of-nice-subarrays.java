class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
// Converting the array into 0 and 1 
        for(int i=0; i<n; i++){
            if(isOdd(nums[i])){
                nums[i] = 1;
            }
            else{
                nums[i] = 0;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1); // Sum and count 

        int ans = 0;
        int sum = 0;
        // int j = 0;

        for(int j=0; j<n; j++){
            sum+=nums[j];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            // j++;
        }

        return ans;
    }
    public boolean isOdd(int a){
         return ((a & 1) == 1); 
    }
}