// class Solution {
//     public int[] findBall(int[][] grid) {
//         int n=grid.length;
//         int m=grid[0].length;
//         int[] ans = new int[n];
//         for(int j=0; j<m; j++){
//             int cpos=j;
//             int npos=-1;

//             for(int i=0; i<n; i++){
//                 npos=cpos+grid[i][cpos];  //1->right, -1->left

//                 if(npos<0 || npos>=m || grid[i][cpos]!=grid[i][npos]){
//                     cpos=-1;
//                     break;
//                 }
//                 cpos=npos;
//             }
//             ans[j]=cpos;
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] findBall(int[][] grid) {

        int[] result = new int[grid[0].length];

        for(int i=0; i<result.length; i++){
            result[i] = dfs(0,i,grid);
        }
        return result;
    }

    private int dfs(int i, int j, int[][] grid){

        if(i == grid.length){
            return j;
        }

        int newj = j + grid[i][j];

        if(newj<0 || newj>=grid[0].length || grid[i][j] != grid[i][newj]){
            return -1;
        }

        

       
        return dfs(i+1,newj,grid);   
       

    }
}