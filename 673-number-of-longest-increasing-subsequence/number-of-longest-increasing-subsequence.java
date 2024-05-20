class Solution {
    public int findNumberOfLIS(int[] arr) {
        int n = arr.length;

        int[] dp = new int[n];
        int[] cnt = new int[n];

        Arrays.fill(dp,1);
        Arrays.fill(cnt, 1);

        int maxi = 1;

        for(int i=0; i<=n-1; i++){
            for(int previndex=0; previndex<=i-1; previndex++){
                if(arr[previndex]<arr[i] && dp[previndex]+1>dp[i]){
                    dp[i] = dp[previndex]+1;
                    cnt[i] = cnt[previndex]; // we will get a LIS of n
                }

                else if(arr[previndex]<arr[i] && dp[previndex]+1==dp[i]){
                    cnt[i]  = cnt[i]+cnt[previndex];
                }
            }

            maxi = Math.max(maxi, dp[i]);
        }

        // return cnt values for max value in DP array
        int nos = 0;
        for(int i=0; i<=n-1; i++){
            if(dp[i]==maxi) nos+=cnt[i];
        }

        return nos; 
    }
}