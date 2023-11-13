class Solution {
    public int minBitFlips(int start, int goal) {
        int count = 0;
        while(start>0 || goal>0){
            if((start&(1))!=(goal&(1))){
                count++;
            }

            start = start>>1;
            goal = goal>>1;
        } 
        return count;
    }
}

/*
Binary Form of 10 is 1010 and 7 is 0111
XOR of both 10 and 7 is 1101.
Number of 1 in 1101 is 3. Hence answer is 3.
You need to flip 3 bits to convert 10 to 7
*/