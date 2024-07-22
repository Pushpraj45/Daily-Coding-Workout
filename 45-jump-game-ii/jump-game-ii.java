class Solution {
    public int jump(int[] arr) {
           // Every index has so many ways and we have to take minimum from all of that 
         int[] memo = new int[arr.length];
        Arrays.fill(memo,-1);
        return helperr(arr, 0, memo);
    }

        public int helperr(int[] arr, int index, int[] memo){
        if (index >= arr.length - 1) {
            return 0;
        }
        // If the result is already computed, return it
        if (memo[index] != -1) {
            return memo[index];
        }

        int ans = arr.length;
        // Iterate over the range of jumps possible from the current index
        for (int i = 1; i <= arr[index]; i++) {
            // if (index + i < arr.length) {
                ans = Math.min(ans, 1 + helperr(arr, index + i, memo));
            // }
        }

        // Store the result in memo array
        memo[index] = ans;
        return ans;
    }
}