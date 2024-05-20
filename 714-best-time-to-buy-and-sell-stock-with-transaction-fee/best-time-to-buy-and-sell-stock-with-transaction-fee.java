class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int dp[][] = new int[n][2];
        
        // Initialize dp array with -1 to mark states as not calculated yet
        for (int row[] : dp) {
            Arrays.fill(row, -1);
        }
         int ans = MaximumProfitAfterFees(prices, 0, 0, n, fee, dp);
        return ans;
    }
      public int MaximumProfitAfterFees(int[] arr, int index, int buy, int n, int fees, int[][] dp){
        if(index==n){
            return 0;
        }
        if(dp[index][buy]!=-1){
            return dp[index][buy];
        }
        int profit = Integer.MIN_VALUE;

        if(buy==0){
            profit = Math.max(0+MaximumProfitAfterFees(arr, index+1, 0, n, fees, dp), -arr[index]+MaximumProfitAfterFees(arr, index+1, 1, n, fees, dp));
        }
        if(buy==1){
            profit = Math.max(0+MaximumProfitAfterFees(arr, index+1, 1, n, fees, dp), arr[index]-fees+MaximumProfitAfterFees(arr, index+1, 0, n, fees, dp));
        }
        return dp[index][buy] = profit;

    }
}