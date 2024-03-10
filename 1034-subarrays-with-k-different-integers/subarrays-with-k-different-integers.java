class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // Will be doing this using atmost K technique
         return atmost(nums,k)-atmost(nums,k-1);
    }

    private int atmost(int[] nums, int k){
        // Here will be finding all possible subarrays till k which are possible
        int start = 0;
        int end = 0;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(end=0; end<nums.length; end++){
            map.put(nums[end], map.getOrDefault(nums[end],0)+1);

            while(map.size()>k){
                // Shrinking the window by removing the start pointer 
                if(map.get(nums[start])>1){
                    map.put(nums[start], map.get(nums[start])-1);
                }
                else{
                    map.remove(nums[start]);
                }
                start++;
            }
            ans+=end-start+1;
        }
        return ans;
    }
}