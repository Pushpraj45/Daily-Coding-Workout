class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
         int balance = 100;
        if(purchaseAmount==0){
            return 100;
        }
        
        if(purchaseAmount%10 == 0){
            return balance - purchaseAmount;
        }
        
        int reverserem = purchaseAmount%10;
        int reversediv = purchaseAmount/10;
        
        if(reverserem>=5){
            reversediv++;
        }
        
        int amount = reversediv*10;
        balance -= amount;
        return balance;

    }
}