class Solution {
    public int change(int sum, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n+1][sum+1];

        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(i==0){
                    dp[i][j]=0;
                }
                if(j==0){
                    dp[i][j] = 1; // sum is 0 there is always a way 
                }
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(coins[i-1]<=j){
                    dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][sum];
    }
}