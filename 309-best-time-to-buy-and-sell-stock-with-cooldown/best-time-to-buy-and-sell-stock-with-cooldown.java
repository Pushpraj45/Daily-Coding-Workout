class Solution {
    public int maxProfit(int[] prices) {
         int n = prices.length;
        // BC not necessary as DP 0 se hi init rehti hai hamesha 
        int[][]dp = new int[n+2][2]; 
         for(int[] row: dp){
          Arrays.fill(row, -1);
        }
        return MaximumProfitMMIII(prices,n,0,0,dp);

        // Traverse from the opposite direction of the Memoization 
        // for(int ind=n-1; ind>=0; ind--){
        //     for(int buy = 0; buy<=1; buy++){
               
        //             if(buy==0){
        //                 dp[ind][buy] = Math.max(0+dp[ind+1][0], -prices[ind]+dp[ind+1][1]);

        //             }
        //             if(buy==1){
        //                 dp[ind][buy] = Math.max(0+dp[ind+1][1], prices[ind]+dp[ind+2][0]); // ind+2 tak chalegi bas ab ye 
        //             }
                
        //     }
        // }

        // return dp[0][0]; 

    }
    // Memo code 
     public static int MaximumProfitMMIII(int[] arr, int n, int index, int buy, int[][]dp){
        // 3d dp for ind,buy, cap
        if(index>=n){
            return 0;
        }

        if(dp[index][buy]!=-1){
            return dp[index][buy];
        }

        int profit= Integer.MIN_VALUE;
        if(buy==0){
            profit = Math.max(0+MaximumProfitMMIII(arr, n, index+1, 0, dp), -arr[index]+MaximumProfitMMIII(arr, n, index+1, 1, dp));
        }
        if(buy==1){
            profit = Math.max(0+MaximumProfitMMIII(arr, n, index+1, 1,  dp), arr[index]+MaximumProfitMMIII(arr, n, index+2, 0, dp));
        }

        return dp[index][buy] = profit;

    }
}