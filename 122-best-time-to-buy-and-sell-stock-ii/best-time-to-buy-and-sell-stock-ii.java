class Solution {
    public int maxProfit(int[] Arr) {
            int n = Arr.length;
            // int[][] dp = new int[n][n];
            // for(int[] row: dp){
            //     Arrays.fill(row,-1);
            // }

            // return MaximumProfitMMII(prices, 0, 0, n, dp);
             int[][] dp = new int[n + 1][2];

        // Initialize the entire dp table with -1
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Base condition: If we have no stocks to buy or sell, profit is 0
        dp[n][0] = dp[n][1] = 0;

        int profit = 0;

        // Iterate through the array in reverse to calculate the maximum profit
        for (int ind = n - 1; ind >= 0; ind--) {
            for (int buy = 0; buy <= 1; buy++) {
                if (buy == 0) { // We can buy the stock
                    profit = Math.max(0 + dp[ind + 1][0], -Arr[ind] + dp[ind + 1][1]);
                }

                if (buy == 1) { // We can sell the stock
                    profit = Math.max(0 + dp[ind + 1][1], Arr[ind] + dp[ind + 1][0]);
                }

                dp[ind][buy] = profit;
            }
        }
        return dp[0][0];
    }
     public  int MaximumProfitMMII(int[] arr, int ind, int buy, int n, int[][] dp){
        if(ind == n){
            return 0;
        }
        if(dp[ind][buy]!=-1){
            return dp[ind][buy];
        }

        int profit=0; 
        if(buy == 0){
            profit=Math.max(0+MaximumProfitMMII(arr, ind+1, 0, n, dp), -arr[ind]+MaximumProfitMMII(arr, ind+1, 1, n, dp));
        }
        if(buy ==1){
            profit = Math.max(0+MaximumProfitMMII(arr, ind+1, 1, n, dp), arr[ind]+MaximumProfitMMII(arr, ind+1, 0, n, dp));
        }

        // If arraylist then 
        // dp.get(ind).set(buy,profit);
        dp[ind][buy] = profit;
        return profit;
    }
}