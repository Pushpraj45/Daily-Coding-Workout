public class Solution {
    public boolean isPowerOfTwo(int n) {
        /* Approach - 1
        for (int i = 0; i < 31; i++) {
            int ans = (int) Math.pow(2, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }
    
    Approach - 2
     
        if (n == 0) return false;
        
        while (n > 0) {
            if (n == 1) return true;
            if (n % 2 != 0) break;
            n /= 2;
        }
        return false;
    }
    */
    if (n <= 0) return false;
        if (n == 1) return true;
        return (n % 2 == 0) && isPowerOfTwo(n / 2);
        }
}