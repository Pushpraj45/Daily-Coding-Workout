public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int nofone = 0;
        for(int i=0; i<32; i++){
            if((n & 1)!=0){
                nofone++;
            }

            n>>=1; 
        }
        
        return nofone; 
}
}

// 32 Bit Number that's why loop 