class Solution {
    public int[] finalPrices(int[] prices) {
    //    int n = prices.length;
    //     int[] answer = new int[n];
    //     System.arraycopy(prices, 0, answer, 0, n);

    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             if (prices[j] <= prices[i]) {
    //                 answer[i] -= prices[j];
    //                 break;
    //             }
    //         }
    //     }
    //     return answer;

      int n = prices.length;
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() > prices[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                arr[i] = prices[i];
            } else {
                arr[i] = prices[i] - st.peek();
            }
            st.push(prices[i]);
        }
        
        return arr;

    }
}