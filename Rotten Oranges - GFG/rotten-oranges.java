//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here
        int ans = 0;
        int[][] dir = {{-1,0},{1,0}, {0,-1}, {0,1}};
        Queue<int[]> current = new LinkedList<>();
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
            {
                if(grid[i][j] == 2)
                {
                    current.add(new int[] {i,j,0});
                }
            }
        }
        
        while(!current.isEmpty())
        {
            int[] cur = current.poll();
            int r = cur[0];
            int c = cur[1];
            
            for(int[] rc: dir)
            {
                int row = r + rc[0];
                int col = c + rc[1];
                if(row <0 || row >= grid.length || col <0 || col>= grid[0].length|| grid[row][col] != 1)
                    continue;
                else
                {
                    grid[row][col] = 2;
                    current.add(new int[]{row, col, cur[2]+1});
                    ans = Math.max(ans, cur[2] +1);
                }
            }
        }
        
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
            {
                if(grid[i][j] == 1)
                {
                    return -1;
                }
            }
        }
        
        return ans;
    }
}