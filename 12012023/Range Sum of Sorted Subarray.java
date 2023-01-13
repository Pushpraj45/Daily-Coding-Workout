class Solution {
 
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] subarr = new int[n*(n+1)/2];
        int k = 0; // index for our subarr

        for(int i = 0; i < n; i++) {
            int currsum = 0;
            for(int j = i; j < n; j++) {
                currsum = currsum + nums[j];
                subarr[k++] = currsum;
            }
        }
     
        Arrays.sort(subarr);
        int res = 0, mod = 1000000007;
        // Arrays.sort(sums);
        for(int i = left-1; i < right; i++) {
            res = (res+subarr[i])%mod;
        }
        
        return res;
    }
}
    