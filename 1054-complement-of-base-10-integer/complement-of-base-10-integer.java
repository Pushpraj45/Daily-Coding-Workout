class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        int temp = (int) (Math.pow(2, digits(n))-1);
        return temp-n;
    }
    public int digits(int n){
        int count = 0;
        while(n>0){
            n/=2;
            count++;
        }

        return count;
    }
}