class Solution {
    public int maxProfit(int[] prices) {
    //     int n = prices.length;
    //     int[][][] dp = new int[n][2][3]; // index, buy, cap (2 atmost) size - +1 deke banate hai bhai jyada soch mat

    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<2; j++){
    //             Arrays.fill(dp[i][j], -1); // Aise hi init karte hai 3d dp ko bhai 
    //         }
    //     }

    //     return MaximumProfitMMIII(prices, n, 0, 0, 2, dp);
    // }
    // public  int MaximumProfitMMIII(int[] arr, int n, int index, int buy, int cap, int[][][]dp){
    //     // 3d dp for ind,buy, cap
    //     if(index==n || cap==0){
    //         return 0;
    //     }

    //     if(dp[index][buy][cap]!=-1){
    //         return dp[index][buy][cap];
    //     }

    //     int profit = Integer.MIN_VALUE;
    //     if(buy==0){
    //         profit = Math.max(0+MaximumProfitMMIII(arr, n, index+1, 0, cap, dp), -arr[index]+MaximumProfitMMIII(arr, n, index+1, 1, cap, dp));
    //     }
    //     if(buy==1){
    //         profit = Math.max(0+MaximumProfitMMIII(arr, n, index+1, 1, cap, dp), arr[index]+MaximumProfitMMIII(arr, n, index+1, 0, cap-1, dp));
    //     }

    //     return dp[index][buy][cap] = profit;

    // }
    int n = prices.length;

        // Creating a 3D dp array of size [n+1][2][3] initialized to 0
        int[][][] dp = new int[n + 1][2][3];

        // Loop through the dp array, starting from the second last stock (ind=n-1)
        for (int ind = n - 1; ind >= 0; ind--) {
            for (int buy = 0; buy <= 1; buy++) {
                for (int cap = 1; cap <= 2; cap++) {

                    if (buy == 0) { // We can buy the stock
                        dp[ind][buy][cap] = Math.max(0 + dp[ind + 1][0][cap],
                                -prices[ind] + dp[ind + 1][1][cap]);
                    }

                    if (buy == 1) { // We can sell the stock
                        dp[ind][buy][cap] = Math.max(0 + dp[ind + 1][1][cap],
                                prices[ind] + dp[ind + 1][0][cap - 1]);
                    }
                }
            }
        }

        // The maximum profit with 2 transactions is stored in dp[0][0][2]
        return dp[0][0][2];
    }
}