class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=1;
        int checker=0;

        for(int i=1; i<nums.length; i++){
            if(nums[i]-nums[checker]>k){
                ans++;
                checker=i;
            }
        }
        return ans;
    }
}