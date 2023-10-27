class Solution {
    public int arrangeCoins(int n) {
        if(n==1 || n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }

        int i=1;
        int ans = 0;

        while(i<=n){
            n=n-i;
            ans++;
            i++;
        }
        return ans;

    }
}