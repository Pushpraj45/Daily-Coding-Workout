class Solution {
    static int prime = (int) (Math.pow(10, 9) + 7);

    public int numDistinct(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        // int[][] dp = new int[n][m];  // Correct dimensions

        // for (int[] row : dp) {
        //     Arrays.fill(row, -1);
        // }

        // return NoOfDisSubMemo(s1, s2, n - 1, m - 1, dp);

              int[][] dp = new int[n+1][m+1];

        // Init the first column with 1 becuase there's one empty subsequence in any string
        for(int i=0; i<n+1; i++){
            dp[i][0] = 1;
        }
        // Init the first row except dp[0][0] with 0 because there is not way to form s2 from an empty string s1
        for(int j=1; j<m+1; j++){
            dp[0][j] = 0; 
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    // Either exclude or include for further check
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j])%prime;
                }
                else{
                    // If the characters don't match, we can only exclude this character.
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][m];
    }

    public static int NoOfDisSubMemo(String x, String y, int ind1, int ind2, int[][] dp) {
        // We have exhausted y, there's one valid subsequence, and that is the empty string in s1 
        if (ind2 < 0) {
            return 1;
        } 

        // We have exhausted x, but not y, there are no valid subsequences
        if (ind1 < 0) {
            return 0;
        } 

        if (dp[ind1][ind2] != -1) {
            return dp[ind1][ind2];
        }

        // If the characters at the current position match
        if (x.charAt(ind1) == y.charAt(ind2)) {
            int leaveOne = NoOfDisSubMemo(x, y, ind1 - 1, ind2 - 1, dp);
            int stayOnS2 = NoOfDisSubMemo(x, y, ind1 - 1, ind2, dp);

            dp[ind1][ind2] = (leaveOne + stayOnS2) % prime;
        } else {
            dp[ind1][ind2] = NoOfDisSubMemo(x, y, ind1 - 1, ind2, dp);
        }

        return dp[ind1][ind2];
    }
}
