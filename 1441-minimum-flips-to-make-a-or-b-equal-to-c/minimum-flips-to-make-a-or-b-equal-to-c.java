class Solution {
    public int minFlips(int a, int b, int c) {
        int flips = 0;
        while(a!=0 || b!=0 || c!=0){
            int t1 = a & 1;
            int t2 = b & 1;
            int t3 = c & 1;

            if((t1 | t2 )!=t3){
                if((t1&t2) == 1){
                    // It means we need to perform min of two flips to make them equal see OR table with AND table in comparison 
                    flips+=2;
                }
                else{
                    flips+=1;
                }
            }

            a>>=1;
            b>>=1;
            c>>=1;
        }

        return flips; 
    }
}

