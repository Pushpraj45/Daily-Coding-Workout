class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // int count = 0;
        // for (int i = 0; i < nums.length; i += 1) {
        //     Set<Integer> set = new HashSet<>();
        //     for (int j = i; j < nums.length; j += 1) {
        //         set.add(nums[j]);
        //         if (set.size() == k) {
        //             count += 1;
        //         }
        //     }
        // }
        // return count;
         return atmost(nums, k) - atmost(nums, k - 1);
    }

    private int atmost(int[] nums, int k){
        // Here will be finding all possible subarrays till k which are possible
       int ans = 0;
       int n = nums.length; 
       int start = 0;
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int right=0; right<n; right++){
        map.put(nums[right], map.getOrDefault(nums[right],0)+1);

        while(map.size()>k){

            if(map.get(nums[start])>1){
            map.put(nums[start], map.get(nums[start])-1);
        }
        else{
            map.remove(nums[start]);
        }

        start++;
       }
       ans+=right-start+1;
    }

    return ans;
}
}