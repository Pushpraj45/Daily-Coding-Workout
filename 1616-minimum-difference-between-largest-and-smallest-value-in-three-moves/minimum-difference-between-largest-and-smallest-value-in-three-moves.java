class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length;
        if(n<=4) return 0;

        int ans = Integer.MAX_VALUE;

        for(int i=0; i<=3; i++){
            ans = Math.min(ans, nums[n-4+i]-nums[i]);
        }

        return ans;
        
        // int ans1 = Math.min(nums[0], nums[n-1]);
        // int ans2 = Math.min(nums[1], nums[n-2]);
        // int ans3 = Math.min(nums[2], nums[n-3]);

        // return Math.min(ans1, Math.min(ans2, ans3));
    }
}