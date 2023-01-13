class Solution {
    public boolean canPartition(int[] arr) {
        int n=arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int W = sum / 2;
        int dp[][] = new int[n + 1][W + 1];

//        bottom up
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (arr[i - 1] <= j) { //valid
                    dp[i][j] = Math.max(arr[i - 1] + dp[i - 1][j - arr[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        int sum1=dp[n][W];
        int sum2= sum-sum1;
        return  sum1==sum2;
    }
}