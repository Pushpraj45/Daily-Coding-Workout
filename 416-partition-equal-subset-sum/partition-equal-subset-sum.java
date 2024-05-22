import java.util.Arrays;

class Solution {
    public boolean canPartition(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        // If the total sum is odd, it can't be partitioned into two equal subsets
        if (totalSum % 2 == 1) {
            return false;
        } else {
            int target = totalSum / 2;
            return DP(arr, n, target);
        }
    }

    public static boolean DP(int arr[], int n, int sum) {
        boolean dp[][] = new boolean[n + 1][sum + 1];

        // Initialize the dp array
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (i == 0) {
                    dp[i][j] = false; // If array is empty, can't form any sum except 0
                }
                if (j == 0) {
                    dp[i][j] = true; // A sum of 0 can always be formed with any array
                }
            }
        }

        // Fill the dp array using the DP approach
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum];
    }
}
