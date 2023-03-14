class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int len=piles.length/3;
        int result=0;
        for(int i=len; i<piles.length; i+=2){
            result+=piles[i];
        }
        return result;
    }
}