class Solution {

    public int matrixScore(int[][] grid) {
        // We will be maximizing our left most column to gain max sum out of it
        // One function to toggle rows whenever we get 0 we will convert it to 1
        // One function to toggle columns whenever we get 0's count > 1's count will toggle the column
        // after flipping the values we will convert binary numbers into decimal and return the answer

        int res = 0, rows = grid.length, cols = grid[0].length;
        // Row logic
        for (int i = 0; i < rows; i++) {
            if (grid[i][0] == 0) {
                flip_row(i, grid, cols);
            }
        }

        // Column logic
        for (int c = 0; c < cols; c++) {
            // Get count of 0s' & 1s' in a column
            int zeroc = 0, onec = 0;
            for (int r = 0; r < rows; r++) {
                if (grid[r][c] == 0) zeroc++; else onec++;
            }

            if (zeroc > onec) {
                flip_col(c, grid, rows);
            }
        }

        // Get binary strings for extracting values
        int score = 0;
        for (int i = 0; i < rows; i++) {
            score += binaryToDecimal(grid[i]);
        }

        return score;
    }

    private int binaryToDecimal(int[] binaryArray) {
        int decimal = 0;
        for (int i = 0; i < binaryArray.length; i++) {
            decimal = decimal * 2 + binaryArray[i];
        }
        return decimal;
    }

    public static void flip_row(int r, int[][] grid, int col) {
        for (int i = 0; i < col; i++) {
            if (grid[r][i] == 1) grid[r][i] = 0; else grid[r][i] = 1;
        }
    }

    public static void flip_col(int c, int[][] grid, int rows) {
        for (int i = 0; i < rows; i++) {
            if (grid[i][c] == 0) grid[i][c] = 1; else grid[i][c] = 0;
        }
    }
}
