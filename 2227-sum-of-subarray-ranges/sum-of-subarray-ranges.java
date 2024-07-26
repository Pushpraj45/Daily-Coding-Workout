 

class Solution {
    
    // Nearest Smaller to Left
    public int[] NSL(int[] arr) {
        Stack<int[]> st = new Stack<>();
        int[] left = new int[arr.length];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (st.isEmpty()) {
                left[i] = -1;
            } else if (!st.isEmpty() && st.peek()[0] < arr[i]) {
                left[i] = st.peek()[1];
            } else if (!st.isEmpty() && st.peek()[0] >= arr[i]) {
                while (!st.isEmpty() && st.peek()[0] >= arr[i]) {
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

    // Nearest Smaller to Right
    public int[] NSR(int[] arr) {
        Stack<int[]> st = new Stack<>();
        int[] right = new int[arr.length];
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                right[i] = n;
            } else if (!st.isEmpty() && st.peek()[0] <= arr[i]) {
                right[i] = st.peek()[1];
            } else if (!st.isEmpty() && st.peek()[0] > arr[i]) {
                while (!st.isEmpty() && st.peek()[0] > arr[i]) {
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

    // Nearest Greater to Left
    public int[] NGL(int[] arr) {
        Stack<int[]> st = new Stack<>();
        int[] left = new int[arr.length];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (st.isEmpty()) {
                left[i] = -1;
            } else if (!st.isEmpty() && st.peek()[0] > arr[i]) {
                left[i] = st.peek()[1];
            } else if (!st.isEmpty() && st.peek()[0] <= arr[i]) {
                while (!st.isEmpty() && st.peek()[0] <= arr[i]) {
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

    // Nearest Greater to Right
    public int[] NGR(int[] arr) {
        Stack<int[]> st = new Stack<>();
        int[] right = new int[arr.length];
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                right[i] = n;
            } else if (!st.isEmpty() && st.peek()[0] >= arr[i]) {
                right[i] = st.peek()[1];
            } else if (!st.isEmpty() && st.peek()[0] < arr[i]) {
                while (!st.isEmpty() && st.peek()[0] < arr[i]) {
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

    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long sum = 0;
        
        // Calculate nearest smaller to left and right
        int[] NSL = NSL(nums);
        int[] NSR = NSR(nums);
        
        // Calculate nearest greater to left and right
        int[] NGL = NGL(nums);
        int[] NGR = NGR(nums);
        
        // Calculate the sum of subarray ranges
        for (int i = 0; i < n; i++) {
            long maxContribution = (long) (i - NGL[i]) * (NGR[i] - i) * nums[i];
            long minContribution = (long) (i - NSL[i]) * (NSR[i] - i) * nums[i];
            sum += maxContribution - minContribution;
        }
        
        return sum;
    }

    
}
