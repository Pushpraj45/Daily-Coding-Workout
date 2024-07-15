public class Solution {
    public int[] decrypt(int[] arr, int k) {
        int n = arr.length;
        int[] doubledArr = new int[2 * n];
        System.arraycopy(arr, 0, doubledArr, 0, n);
        System.arraycopy(arr, 0, doubledArr, n, n);
        int[] result = new int[n];

        if (k == 0) {
            return result;
        } else if (k > 0) {
            int i = 0, j = 1, sum = 0;
            while (i < n) {
                sum += doubledArr[j];
                if (j - i == k) {
                    result[i] = sum;
                    i++;
                    sum -= doubledArr[i];
                }
                j++;
            }
        } else {
            k *= -1;
            int i = 2 * n - 1, j = 2 * n - 2, sum = 0;
            while (i >= n) {
                sum += doubledArr[j];
                if (i - j == k) {
                    result[i - n] = sum;
                    i--;
                    sum -= doubledArr[i];
                }
                j--;
            }
        }
        return result;
    }
}