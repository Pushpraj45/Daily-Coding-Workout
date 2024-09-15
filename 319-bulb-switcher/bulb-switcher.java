class Solution {
    public int bulbSwitch(int N) {
        // return (int)Math.sqrt(n);
        if (N <= 0) return 0; // Edge case for non-positive N

        // Approximate the integer square root using bit manipulation
        int result = 0;
        int bit = 1 << 30; // The highest power of 2 less than the maximum integer value
        
        // Find the highest bit set in sqrt(N)
        while (bit > N) bit >>= 2;
        
        // Approximate integer square root
        while (bit != 0) {
            if (N >= result + bit) {
                N -= result + bit;
                result += bit << 1;
            }
            result >>= 1;
            bit >>= 2;
        }
        
        return result;
    }
}