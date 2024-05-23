class Solution {
        public static int LPS(String x, int n){
        StringBuilder sb = new StringBuilder(x);
        String revx = sb.reverse().toString();

        return LCSDP(x,revx, n,n);
    }
    public int minInsertions(String x) {
        
        int n = x.length();
        // //n+1 will store res of first n chars of string
        // int[][] dp = new int[n+1][n+1];
        // for(int i=0; i<n; i++) {
        //     for(int j=0; j<n; j++) {
        //         //i+1,j+1 is curr chars of s1 and s2
        //         //if both are equal add 1 to existing res
        //         //if not take max of existing res.
        //         dp[i+1][j+1] = s.charAt(i)==s.charAt(n-j-1)?dp[i][j]+1:
        //         Math.max(dp[i][j+1],dp[i+1][j]);
        //     }
        // }
        // //dp[n][n] will contain length of longest subsequence
        // return n-dp[n][n];
        return n-LPS(x, n);
    }
        public static int LCSDP(String x, String y, int n, int m){
        int[][] dp = new int[n+1][m+1];

        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }

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
}