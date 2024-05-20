class Solution {
    public int maxProfit(int[] arr, int fee) {
        int n = arr.length;
        // int dp[][] = new int[n][2];
        
        // // Initialize dp array with -1 to mark states as not calculated yet
        // for (int row[] : dp) {
        //     Arrays.fill(row, -1);
        // }
        //  int ans = MaximumProfitAfterFees(prices, 0, 0, n, fee, dp);
        // return ans;
         if(n==0)
        {
            return 0;

        }

        int[][] dp = new int[n+1][2];

        for(int index = n-1; index>=0; index--){
            for(int buy=0; buy<=1; buy++){
                int profit = 0;
                if(buy==0){
                    profit = Math.max(0+dp[index+1][0], -arr[index]+dp[index+1][1]);
                }
                if(buy==1){
                    profit = Math.max(0+dp[index+1][1], arr[index]-fee+dp[index+1][0]);
                }

                dp[index][buy]=profit;
            }
        }
        return dp[0][0]; // That will be our answer brooo 
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