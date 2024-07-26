 

class Solution {
    
    public int[] NSL(int[] arr) {
        Stack<int[]> st = new Stack<>();
        int[] left = new int[arr.length];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (st.isEmpty()) {
                left[i] = -1;
            } else if (!st.isEmpty() && st.peek()[0] <= arr[i]) {
                left[i] = st.peek()[1];
            } else if (!st.isEmpty() && st.peek()[0] > arr[i]) {
                while (!st.isEmpty() && st.peek()[0] > arr[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    left[i] = -1;
                } else {
                    left[i] = st.peek()[1];
                }
            }
            st.push(new int[]{arr[i], i});
        }
        return left;
    }

    public int[] NSR(int[] arr) {
        Stack<int[]> st = new Stack<>();
        int[] right = new int[arr.length];
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                right[i] = n;
            } else if (!st.isEmpty() && st.peek()[0] < arr[i]) {
                right[i] = st.peek()[1];
            } else if (!st.isEmpty() && st.peek()[0] >= arr[i]) {
                while (!st.isEmpty() && st.peek()[0] >= arr[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    right[i] = n;
                } else {
                    right[i] = st.peek()[1];
                }
            }
            st.push(new int[]{arr[i], i});
        }
        return right;
    }

    public int sumSubarrayMins(int[] arr) {
        long ans = 0;
        int M = 1_000_000_007;
        int[] left = NSL(arr);
        int[] right = NSR(arr);

        for (int i = 0; i < arr.length; i++) {
            long total_ele = (long) (i - left[i]) * (right[i] - i);
            ans = (ans + total_ele * arr[i]) % M;
        }
        return (int) ans;
    }

 
}
