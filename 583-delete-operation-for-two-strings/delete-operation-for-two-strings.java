class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int lcs = LCS(word1, word2, n, m);

        // The minimum number of deletions required to convert word1 into word2
        // is given by the length of word1 minus the length of the LCS.
        return n - lcs + m-lcs; // hum keval delete kar rahe ha na this why
    }

    // Helper function to calculate the Longest Common Subsequence (LCS)
    public static int LCS(String x, String y, int n, int m) {
        int[][] dp = new int[n + 1][m + 1];

        // Initialize the dp array
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        // Fill the dp array based on the LCS logic
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        // Return the length of LCS
        return dp[n][m];
    }
}
