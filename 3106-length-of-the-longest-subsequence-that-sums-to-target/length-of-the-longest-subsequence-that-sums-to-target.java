class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int sum) {
        int n = nums.size();
        int[][] t = new int[n + 1][sum + 1]; // DP - matrix

        // Initialize the DP matrix
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                t[i][j] = Integer.MIN_VALUE;
            }
        }
        
        t[0][0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                // If we exclude the current element
                t[i][j] = t[i - 1][j];
                
                // If we include the current element
                if (j >= nums.get(i - 1) && t[i - 1][j - nums.get(i - 1)] != Integer.MIN_VALUE) {
                    t[i][j] = Math.max(t[i][j], t[i - 1][j - nums.get(i - 1)] + 1);
                }
            }
        }

        int maxLength = 0;
        for (int i = 0; i <= n; i++) {
            if (t[i][sum] != Integer.MIN_VALUE) {
                maxLength = Math.max(maxLength, t[i][sum]);
            }
        }

        return maxLength > 0 ? maxLength : -1; // If no subsequence is found, return -1
    }
}
