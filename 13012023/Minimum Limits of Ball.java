class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int min = 0;
        int max = 1000000000;

        // Answer will be minimized max value 
        while(min+1<max){
            int mid = (max-min)/2+min;
            int count = 0; // for calculation of operations to divide the array 
            for(int a : nums){
                count +=(a-1)/mid;  // this is the formula we are going to use 
            }

            if(count<=maxOperations){
                max=mid;
            }
            else{
                min = mid;
            }
        }
        return max; // now we find the minimized max value 
        
    }
}