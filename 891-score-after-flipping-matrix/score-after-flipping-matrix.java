class Solution {

    public int matrixScore(int[][] grid) {
        // We will be maximizing our left most column to gain max sum out of it
        // One function to toggle rows whenever we get 0 we will convert it to 1
        // One function to toggle columns whenever we get 0's count > 1's count will toggle the column
        // after flipping the values we will convert binary numbers into decimal and return the answer

       int ans = 0;
       int row = grid.length;
       int col = grid[0].length; 

       for(int i=0; i<row; i++){
           if(grid[i][0]==0){
               toggleRow(grid, i);
           }
       }

       for(int i=0; i<col; i++){
           int a=0, b=0;
           for(int j=0; j<row; j++){
               if(grid[j][i]==1){ // As we are checking for columns so 
                   a++;
               }
               else{
                   b++;
               }
           }

           if(a<b){
               toggleCol(grid, i);
           }
       }

       for(int i=0; i<grid.length; i++){
           ans+=bintodec(grid[i]);
       }
       return ans;
    }

    public void toggleRow(int[][] grid, int row){
        for(int i=0; i<grid[0].length; i++){
            if(grid[row][i] == 1){
                grid[row][i]=0;
            }
            else{
                grid[row][i] = 1;
            }
        }
    } 
    public void toggleCol(int[][] grid, int col){
        for(int i=0; i<grid.length; i++){
            if(grid[i][col] == 1){
                grid[i][col]=0;
            }
            else{
                grid[i][col] = 1;
            }
        }
    }
    public int bintodec(int[] arr){
        int dec = 0;
        for(int i=0; i<arr.length; i++){
            dec = dec*2+arr[i];
        }

        return dec; 
    }
    

}
