class Solution {
    public int minFallingPathSum(int[][] matrix) {
         int n = matrix.length;
        int m = matrix[0].length;

        int dp[][] = new int[n][m];
        for(int j=0; j<m; j++){
            dp[0][j] = matrix[0][j];
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<m; j++){
                int up = matrix[i][j] + dp[i-1][j];


                int leftdiagonal = matrix[i][j];
                if(j-1>=0){
                    leftdiagonal+=dp[i-1][j-1];
                }
                else{
                    leftdiagonal+=(int) Math.pow(10, 9);
                }

                int rightdiagonal = matrix[i][j];
                if(j+1<m){
                    rightdiagonal += dp[i-1][j+1];

                }
                else{
                    rightdiagonal+=(int)Math.pow(10, 9);
                }

                dp[i][j] = Math.min(up, Math.min(leftdiagonal, rightdiagonal) );
            }
        }

        int maxi = Integer.MAX_VALUE;
        for(int j=0; j<m; j++){
            maxi = Math.min(maxi, dp[n-1][j]);
        }

        return maxi;
    }
}