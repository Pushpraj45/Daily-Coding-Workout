class Solution {
    public int[] productExceptSelf(int[] nums) {
        /* Brute Force -TLE
        int[] ans = new int[nums.length];
        int n = nums.length;
         int[] result = new int[n];

    for (int i = 0; i < n; i++) {
        int product = 1;
        for (int j = 0; j < n; j++) {
            if (i != j) {
                product *= nums[j];
            }
        }
        result[i] = product;
    }

    return result;
    */
    int n=nums.length;
    int[] left = new int[n];
    int[] right = new int[n];

    int res[] = new int[n];
// Calculating left products
    left[0]=1;
    for(int i=1; i<n; i++){
        left[i] = left[i-1]*nums[i-1];
    }

// Calculating right products
    right[n-1]=1;
    for(int i=n-2; i>=0; i--){
        right[i] = right[i+1]*nums[i+1];
    }

// Calculating final result

    for(int i=0; i<n; i++){
        res[i] = left[i]*right[i];
    }

    return res;
    }

}