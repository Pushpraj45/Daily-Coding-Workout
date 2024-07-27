class Solution {
    public int[] finalPrices(int[] prices) {
       int n = prices.length;
        int[] answer = new int[n];
        System.arraycopy(prices, 0, answer, 0, n);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    answer[i] -= prices[j];
                    break;
                }
            }
        }
        return answer;

    }
}