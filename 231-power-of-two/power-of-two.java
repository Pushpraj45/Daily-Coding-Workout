public class Solution {
    public boolean isPowerOfTwo(int n) {
        // Approach - 1
        for (int i = 0; i < 31; i++) {
            int ans = (int) Math.pow(2, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }
}