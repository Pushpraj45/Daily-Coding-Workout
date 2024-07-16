class Solution {
    public int minimumCardPickup(int[] nums) {

            int i = 0;
            int j = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
                int ans = Integer.MAX_VALUE;
            while(j<nums.length){
                if(!map.containsKey(nums[j])){
                    map.put(nums[j], j);
                }
                else{
                    while(nums[j]!=nums[i]){
                        map.remove(nums[i]);
                        i++;
                    }
                    map.put(nums[j], j);
                    ans = Math.min(ans, j-i+1);
                    i++;
                }
                j++;
            }

            return ans==Integer.MAX_VALUE?-1:ans;


        // Set<Integer> set = new HashSet<>();

        // for(int i:nums){
        //     set.add(i);
        // }

        // if(set.size()==nums.length){
        //     return -1;
        // }

        // int ans = Integer.MAX_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]!=nums[j]) continue;

        //         else ans = Math.min(ans, j-i+1);
        //     }
        // }

        // return ans;

       
    }
}