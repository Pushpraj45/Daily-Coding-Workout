class Solution {
    static int prime = (int) (Math.pow(10, 9) + 7);

    public int numDistinct(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n][m];  // Correct dimensions

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return NoOfDisSubMemo(s1, s2, n - 1, m - 1, dp);
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
