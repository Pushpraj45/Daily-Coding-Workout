class Solution {
    public long largestPerimeter(int[] nums) {
        long ans = -1;
        Arrays.sort(nums); // Every element would be in ascending order
        // int[] prefix = new int[nums.length];
        long prefix = nums[0] + nums[1];
        for(int i=2; i<nums.length; i++){
            if(prefix>nums[i]){
                ans = Math.max(ans,prefix+nums[i]);
            }

            prefix+=nums[i];
        }

        return ans;
    }
}