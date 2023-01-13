 
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        for(int i=1; i<prices.length;i++){
            if(prices[i-1] < prices[i]){
                maxProfit = maxProfit +  prices[i]-prices[i-1];
            }
        }
        return maxProfit;
    }
}