class Solution {
    public int longestCommonSubsequence(String x, String y) {
    //     int n = x.length();
    //     int m = y.length();
    //    return LCSMemo(x,y,n,m);  // only 18 cases passed bruh!!!!!!!!
     int n = x.length();
        int m = y.length();

        int[][] dp = new int[n+1][m+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                dp[i][j] = 0;
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        return dp[n][m];
    }
    // public static int LCSRec(String x, String y, int n, int m){
    //     if(n==0 || m==0){
    //         return 0;
    //     }
    //     if(x.charAt(n-1)==y.charAt(m-1)){
    //         return 1+LCSRec(x, y, n-1, m-1); 
    //     }
    //     else{
    //         return Math.max(LCSRec(x, y, n-1, m), LCSRec(x, y, n, m-1));
    //     }
    // }
       public static int LCSMemo(String x, String y, int n, int m){
        // int n = x.length();
        // int m = y.length();

        int[][] dp = new int[n+1][m+1];
          for(int[] row:dp){
            Arrays.fill(row, -1);
        }
        if (n==0 || m==0){
            dp[n][m] = 0;
        } 
        
        if(dp[n][m]!=-1){
            return dp[n][m];
        }

        if(x.charAt(n-1)==y.charAt(m-1)){
            dp[n][m] = 1+LCSMemo(x, y,n-1,m-1); 
        }
        else{
            dp[n][m] = Math.max(LCSMemo(x, y, n-1, m), LCSMemo(x, y, n, m-1));

        }

        return dp[n][m];

    }





}