class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        dp[0] = 1;
        dp[1]=1;

        for(int i=2; i<=n; i++){
            int first = dp[i-1]+cost[i-1];

            int second = dp[i-2]+cost[i-2];

            dp[i] = Math.min(first, second);
        }

        return dp[n]-1;


        

    }
}