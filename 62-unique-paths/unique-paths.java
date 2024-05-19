class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for(int[] row:dp){
            Arrays.fill(row,-1);
        }

        return CountMM(m-1,n-1,dp);
    }
    public int CountMM(int m, int n, int[][] dp){
        if(m==0 && n==0){
            return 1;
        }
        if(m<0 || n<0){
            return 0;
        }

        if(dp[m][n]!=-1){
            return dp[m][n];
        }

        int totalup = CountMM(m-1,n,dp);
        int totalleft = CountMM(m, n-1, dp);

        return dp[m][n] = totalup+totalleft;
    }
}