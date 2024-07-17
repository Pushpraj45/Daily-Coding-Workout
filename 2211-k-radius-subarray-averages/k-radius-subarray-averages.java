class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length; 
        int K = 2*k+1;
        int[] ans = new int[n];
        long sum = 0;

        Arrays.fill(ans,-1);

        if(K>n){
            return ans;
        }

        for(int i=0; i<K; i++){
            sum+=nums[i];
        }

        ans[k] = (int)(sum/K); // See 1st test case and all set 
        for(int i=k+1; i<n-k; i++){
            sum+=nums[i+k] - nums[i-k-1]; // Question ki statement hi hai 
            ans[i] = (int)(sum/K); // formula based to pura question hai bhai 
        }

        return ans;
    }
}