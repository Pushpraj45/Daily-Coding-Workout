class Solution {
    public int minimumSum(int num) {
        /*
        Things to do 
        1. Split num into two new integers n1 and n2
        2. For splitting all the digits must be used 
        3. Leading zeroes are allowed 
        */
        
        // String s = String.valueOf(num);
        // // [2,9,3,2] -> Swap to get minimum sum from 4 digits 
        int[] nums=new int[4];
        for(int i=0; i<nums.length; i++){
            nums[i]=num%10;
            num/=10;

            
        }
        Arrays.sort(nums);
        return nums[0]*10+nums[2]+nums[1]*10+nums[3];
      
    }
}