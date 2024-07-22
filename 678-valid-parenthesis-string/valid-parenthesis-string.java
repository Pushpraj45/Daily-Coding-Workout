class Solution {
    private boolean isValidHelper(int index, int openCount, String s, int[][] memo) {
        // Base case: If we've processed the entire string, check if all open brackets are closed
        if (index == s.length()) {
            return openCount == 0;
        }

        // Check the memo table to avoid redundant calculations
        if (memo[index][openCount] != -1) {
            return memo[index][openCount] == 1;
        }

        char currentChar = s.charAt(index);
        boolean isValid = false;

        if (currentChar == '*') {
            isValid = isValidHelper(index + 1, openCount + 1, s, memo) // Consider '*' as '('
                      || (openCount > 0 && isValidHelper(index + 1, openCount - 1, s, memo)) // Consider '*' as ')'
                      || isValidHelper(index + 1, openCount, s, memo); // Consider '*' as ''
        } else if (currentChar == '(') {
            isValid = isValidHelper(index + 1, openCount + 1, s, memo); // Increment open count for '('
        } else if (currentChar == ')') {
            isValid = openCount > 0 && isValidHelper(index + 1, openCount - 1, s, memo); // Decrement open count for ')'
        }

        // Store the result in the memo table
        memo[index][openCount] = isValid ? 1 : 0;
        return isValid;
    }

    // Main function to check if the string is valid
    public boolean checkValidString(String s) {
        int n = s.length();
        int[][] memo = new int[n][n + 1];

        // Initialize memo table with -1 indicating uncomputed states
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        // Start the recursive validation from the first character with zero open brackets
        return isValidHelper(0, 0, s, memo);
    }
}