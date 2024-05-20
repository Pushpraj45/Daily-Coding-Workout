class Solution {
    public int maxProfit(int[] prices) {
         int n = prices.length;
        // BC not necessary as DP 0 se hi init rehti hai hamesha 
        int[][]dp = new int[n+2][2]; // 3-> K+1
        // Traverse from the opposite direction of the Memoization 
        for(int ind=n-1; ind>=0; ind--){
            for(int buy = 0; buy<=1; buy++){
                 // cap ko 1 se till <=k 
                    if(buy==0){
                        dp[ind][buy] = Math.max(0+dp[ind+1][0], -prices[ind]+dp[ind+1][1]);

                    }
                    if(buy==1){
                        dp[ind][buy] = Math.max(0+dp[ind+1][1], prices[ind]+dp[ind+2][0]);
                    }
                
            }
        }

        return dp[0][0]; 
    }
}