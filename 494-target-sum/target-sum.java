class Solution {
    public int findTargetSumWays(int[] nums, int diff) {
         int n = nums.length;
        int sumOfArray = 0;
        for (int i = 0; i < n; i++) {
            sumOfArray += nums[i];
        }
             if(sumOfArray < diff) return 0;
        if((sumOfArray+diff)<0 || ((sumOfArray+diff) % 2) != 0) return 0;

        if ((sumOfArray + diff) % 2 != 0) {
            return 0;
        } else {
            return CountSubsetsWithSum(nums, (sumOfArray + diff) / 2);
        }
    }
     public int CountSubsetsWithSum(int[] nums, int sum) {
        int n = nums.length;
        int[][] t = new int[n + 1][sum + 1]; // DP - matrix

        // Initialization
        t[0][0] = 1; // There's one way to achieve a sum of 0 (by choosing no elements)
        int k = 1; // Counter to keep track of the number of zeros encountered

        // Initialize the DP table
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (i == 0 && j > 0) {
                    t[i][j] = 0; // If there are no elements, we can't achieve any positive sum
                } else if (j == 0 && i > 0) {
                    if (nums[i - 1] == 0) {
                        t[i][j] = (int)Math.pow(2, k); // If the element is zero, it can either be included or not
                        k++;
                    } else {
                        t[i][j] = t[i - 1][j]; // Carry forward the previous result
                    }
                }
            }
        }

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (nums[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - nums[i - 1]] + t[i - 1][j]; // Include or exclude the current element
                } else {
                    t[i][j] = t[i - 1][j]; // Exclude the current element
                }
            }
        }

        return t[n][sum];
    }
}