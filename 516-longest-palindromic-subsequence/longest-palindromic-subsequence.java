class Solution {
    public int longestPalindromeSubseq(String x) {
        int n = x.length();
        StringBuilder sb = new StringBuilder(x);
        String revx = sb.reverse().toString();

        return LCS(x, revx, n, n); 
    }
     public static int LCS(String x, String y, int n, int m){
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