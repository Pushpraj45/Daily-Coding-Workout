class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i =0; i<prices.length; i++){
            if(buyPrice<prices[i]){
                int Profit = prices[i] - buyPrice; // Selling price mein se buyprice ko remove kar diya 
                maxProfit = Math.max(Profit, maxProfit);

            }
            else{
                buyPrice = prices[i]; // Initially ye condition hit hogi 
            }
        }
        return maxProfit;
    }
}