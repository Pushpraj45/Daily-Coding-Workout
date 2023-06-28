class Solution {
    public int minOperations(int[] nums) {
        if(nums.length==0||nums.length==1){
            return 0;
        }
        int count = 0;
        for(int i=1; i<nums.length; i++){
           if(nums[i]<=nums[i-1]){
            //    This is the minimum increment we have to do to make our array strictly decreasing 
               int c=nums[i-1]-nums[i]+1;
            //    Added incremented value to the element of our array and updated it 
               nums[i]+=c;
            //    Added it in our ans as well 
               count+=c;
           }
        }
        return count; 
    }
}