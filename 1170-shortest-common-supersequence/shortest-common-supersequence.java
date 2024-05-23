class Solution {
    public String shortestCommonSupersequence(String x, String y) {
        int n = x.length();
        int m = y.length();
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
            for (int j = 1; j <= m; j++) {  // Fixed index here
                if (x.charAt(i - 1) == y.charAt(j - 1)) {  // Fixed index here
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        // Build the shortest common supersequence
        int i = n, j = m;
        StringBuilder ans = new StringBuilder();

        while (i > 0 && j > 0) {
            if (x.charAt(i - 1) == y.charAt(j - 1)) {  // Fixed index here
                ans.append(x.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i][j - 1] > dp[i - 1][j]) {
                ans.append(y.charAt(j - 1));
                j--;
            } else {
                ans.append(x.charAt(i - 1));
                i--;
            }
        }

        // Append remaining characters of x
        while (i > 0) {
            ans.append(x.charAt(i - 1));
            i--;
        }

        // Append remaining characters of y
        while (j > 0) {
            ans.append(y.charAt(j - 1));
            j--;
        }

        // Reverse the result string and return
        return ans.reverse().toString();
    }
}
