class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int MOD = 1000000007;
        long[] dp = new long[high + 1];
        dp[0] = 1; // Base case: one way to create an empty string

        // Fill the dp array
        for (int i = 1; i <= high; i++) {
            if (i >= zero) {
                dp[i] = (dp[i] + dp[i - zero]) % MOD; // Append zero
            }
            if (i >= one) {
                dp[i] = (dp[i] + dp[i - one]) % MOD; // Append one
            }
        }

        // Sum the valid strings from dp[low] to dp[high]
        long result = 0;
        for (int i = low; i <= high; i++) {
            result = (result + dp[i]) % MOD;
        }

        return (int) result;
    }
}