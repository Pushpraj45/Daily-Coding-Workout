class Solution {
    public int coinChange(int[] coins, int sum) {
        int n = coins.length;
        int[][]dp = new int[n+1][sum+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(j==0){
                    dp[i][j] = 0;
                }
                if(i==0){
                    dp[i][j] = Integer.MAX_VALUE-1;
                }

                if(i==1){
                    if(j%coins[i-1]==0){
                        dp[i][j] = j/coins[i-1];
                    }
                    else{
                        dp[i][j] = Integer.MAX_VALUE-1;
                    }
                }
            }
        }

        dp[0][0] = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(coins[i-1]<=j){
                    dp[i][j] = Math.min(dp[i-1][j], 1+dp[i][j-coins[i-1]]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        if(dp[n][sum]==Integer.MAX_VALUE-1){
            return -1;
        }
        else{
            return dp[n][sum];
        }
    }
}