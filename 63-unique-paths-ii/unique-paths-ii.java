class Solution {
    public int uniquePathsWithObstacles(int[][] maze) {
            int m = maze.length;
            int n = maze[0].length;
          int dp[][] = new int[m][n];
        
        // Initialize the dp array with -1
        for (int row[] : dp)
            Arrays.fill(row, -1);
        
        // Call the helper function starting from the bottom-right cell
        
        return mazeObstaclesUtil(m - 1, n - 1, maze, dp);
    }
   
      public int mazeObstaclesUtil(int i, int j, int[][] maze, int[][] dp) {
        // If there's an obstacle at this cell or out of bounds, return 0
       if (i == 0 && j == 0) {
        if (maze[i][j] == 1) {
            return 0;
        }
        return 1;
    }
    if(i<0 || j<0)return 0;
    if(maze[i][j]==1)return 0;
        // If we've already calculated this cell, return the stored result
        if (dp[i][j] != -1)
            return dp[i][j];

        // Calculate the number of paths by moving up and left
        int up =  mazeObstaclesUtil(i - 1, j, maze, dp);
        int left =  mazeObstaclesUtil(i, j - 1, maze, dp);

        // Store the result and return it
        return dp[i][j] = up + left;
    }

}