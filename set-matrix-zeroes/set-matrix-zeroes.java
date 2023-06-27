class Solution {
    public void setZeroes(int[][] matrix) {

        // int row[] = new int[n];
       int[] row = new int[matrix.length];
       Arrays.fill(row,0); 
       int[] col = new int[matrix[0].length];
       Arrays.fill(col,0);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){

                   row[i] = 1;
                   col[j] = 1;
                }
            }
        }

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j] =0;
                }
            }
        }
    }
}