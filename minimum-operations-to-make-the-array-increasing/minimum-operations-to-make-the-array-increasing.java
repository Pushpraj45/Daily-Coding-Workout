class Solution {
    public int minOperations(int[] nums) {
        if(nums.length==0||nums.length==1){
            return 0;
        }
        int count = 0;
        for(int i=1; i<nums.length; i++){
           if(nums[i]<=nums[i-1]){
               int c=nums[i-1]-nums[i]+1;
               nums[i]+=c;
               count+=c;
           }
        }
        return count; 
    }
}