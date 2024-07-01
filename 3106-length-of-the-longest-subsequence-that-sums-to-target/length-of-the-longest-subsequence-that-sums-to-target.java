class Solution {
       public int lengthOfLongestSubsequence(List<Integer> nums, int sum) {
        return solve(nums, sum, nums.size(), new Integer[nums.size()+1][sum+1]) - 1;
    }
    
    public int solve(List<Integer> nums, int sum, int n, Integer dp[][]) {
        if (sum == 0) return 1; // Base condition: sum is achieved
        if (sum < 0 || n == 0) return 0; // Base condition: sum not possible or no items left
        
        if (dp[n][sum] != null) return dp[n][sum]; // Return memoized result

        // Include current element and check
        int in = solve(nums, sum - nums.get(n - 1), n - 1, dp);
        // Exclude current element and check
        int ex = solve(nums, sum, n - 1, dp);
        
        int r;
        if (in == 0 && ex == 0) r = 0;
        else r = Math.max(in + 1, ex);
        
        return dp[n][sum] = r; // Memoize and return result
    }
}
