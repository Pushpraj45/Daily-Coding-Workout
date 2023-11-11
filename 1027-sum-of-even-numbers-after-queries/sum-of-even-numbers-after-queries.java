class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int evensum = 0;
        for(int x:nums){
            if(x%2==0){
                evensum+=x;
            }
        }
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int idx = queries[i][1];
            int val = queries[i][0];

            if(nums[idx]%2==0){
                evensum-=nums[idx];
            }
            nums[idx]+=val;

            if(nums[idx]%2==0){
                evensum+=nums[idx];
            }
            ans[i] = evensum;
        }
        return ans;
    }
}