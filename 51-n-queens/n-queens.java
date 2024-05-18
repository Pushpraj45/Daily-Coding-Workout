class Solution {

    public List<List<String>> solveNQueens(int n) {
        /*
        char[][] ans = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = '.';
            }
        }
        solutions = new LinkedList<List<String>>();
        backTracker(ans, 0, n);
        return solutions;
        */

        // Optimal Approach 
        char[][] ans = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = '.';
            }
        }

    List<List<String>> res = new ArrayList<List<String>>();

    int leftrow[] = new int[n];
    int upper[] = new int[2*n-1];
    int lower[] = new int[2*n-1];

    solve(0,ans,res,leftrow,lower,upper);
    return res;
 

    }

    /*
    void backTracker(char[][] ans, int row, int n) {
        if (row == n) {
            List<String> solution = new LinkedList<String>();
            for (int i = 0; i < n; i++) {
                solution.add(new String(ans[i]));
            }
            solutions.add(solution);
            return;
        }

        for (int i = 0; i < n; i++) {
            ans[row][i] = 'Q';
            if (isValidPlacement(ans, row, i, n)) {
                backTracker(ans, row + 1, n);
            }
            ans[row][i] = '.';
        }
    }
    

    boolean isValidPlacement(char[][] matrix, int row, int column, int n) {
        //checking vertical
        for (int i = 0; i < n; i++) {
            if (i != row && matrix[i][column] == 'Q') {
                return false;
            }
        }
        //checking horizontal
        for (int i = 0; i < n; i++) {
            if (i != column && matrix[row][i] == 'Q') {
                return false;
            }
        }
        //NW direction
        int i = row - 1;
        int j = column - 1;
        while (i >= 0 && j >= 0) {
            if (matrix[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }

        //NE direction
        i = row - 1;
        j = column + 1;
        while (i >= 0 && j < n) {
            if (matrix[i][j] == 'Q') {
                return false;
            }
            i--;
            j++;
        }

        //SW direction
        i = row + 1;
        j = column - 1;
        while (i < n && j >= 0) {
            if (matrix[i][j] == 'Q') {
                return false;
            }
            i++;
            j--;
        }

        //SE direction
        i = row + 1;
        j = column + 1;
        while (i < n && j < n) {
            if (matrix[i][j] == 'Q') {
                return false;
            }
            i++;
            j++;
        }

        return true;
    }
    */

    static void solve(int col, char[][] board, List < List < String >> res, int leftRow[], int lowerDiagonal[], int upperDiagonal[]) {
        if (col == board.length) {
            res.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[board.length - 1 + col - row] == 0) {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[board.length - 1 + col - row] = 1;
                solve(col + 1, board, res, leftRow, lowerDiagonal, upperDiagonal);
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[board.length - 1 + col - row] = 0;
            }
        }
    }
     static List < String > construct(char[][] board) {
        List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
