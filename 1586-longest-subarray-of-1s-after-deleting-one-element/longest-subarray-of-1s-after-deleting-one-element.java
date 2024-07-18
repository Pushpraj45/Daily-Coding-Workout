class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int count = 0;
        int ma = Integer.MIN_VALUE;
        int ans = 0;

        while(right<nums.length){
            if(nums[right]==0){
                count++;
                // right++;
            }

            while(count>1){
                if(nums[left]==0){
                    count--;
                }

                left++;
            }

            right++;

            ans = Math.max(ans, right-left);


        }

        return ans-1;
    }
}