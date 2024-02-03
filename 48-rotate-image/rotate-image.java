class Solution {
    public void rotate(int[][] matrix) {
        /*
        Here we will first transpose the matrix so then it will look something like this 
        4,5,6           4,7,10                      10,7,4
        7,8,9      ->   5,8,11      -> Reversed Row 11,8,5
        10,11,12        6,9,12                      12,9,6
        */
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<matrix[0].length; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }


        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp; 
            }
        }
    }
}