class Solution {
    public boolean check(int[] nums) {
        int dp = 0;
        for(int i=1; i<nums.length; i++){
           if(nums[i]<nums[i-1]){
               dp++;
           }
           }

           if(dp==0){
               return true;
           }
           if(dp==1 && nums[0]>=nums[nums.length-1]){
               return true;
           }
        
        return false;
    }
}