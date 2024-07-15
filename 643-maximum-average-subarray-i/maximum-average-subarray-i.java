class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i =0; 
        int j =0; 
        int sum = 0;
        double ans = Integer.MIN_VALUE;
        // int avg = Integer.MIN_VALUE;

        while(j<nums.length){
            sum+=nums[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                ans = Math.max(ans, sum);
                sum-=nums[i];
                i++;
                j++;
            }
        }

        return ans/(double)k;
    }
}