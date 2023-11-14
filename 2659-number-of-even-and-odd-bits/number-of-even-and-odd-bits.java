class Solution {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        if(n==0){
            return new int[]{0,0};
        }

        int i=0;
        while(n>0){
            if(i%2==0){
                if((n & 1)==1){
                    even++;
                }
            }
            else{
                if((n & 1)==1){
                    odd++;
                }
            }
            i++;
            n=n>>1; // Right shift n for further checking
        }
        return new int[]{even, odd};
    }
}