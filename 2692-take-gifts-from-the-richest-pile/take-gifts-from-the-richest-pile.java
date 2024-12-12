 
     class Solution {
    public long pickGifts(int[] gifts, int k) {
        Arrays.sort(gifts);
        int n=gifts.length;
        // loop to iterate backwards in gifts array 
        for(int i=n-1,j=1;j<=k;j++)
        {
            // checking whether thers's single gift or not if yes we will break the loop 
            if(gifts[i]==1)
            {
                break;
            }
            // typecasting to int to avoid double or any error related to this 
            int p=(int)(Math.sqrt(gifts[i]));
            // stored p in ith index of gifts array 
            gifts[i]=p;
            // again sorted for upcoming loop work 
            Arrays.sort(gifts);
        }
        // crating an answer variable s of long to avoid incompatible types 
        long s=0;
        // simple for-each loop 
        for(int i:gifts)
        {
            s+=(long)i;
        }
        return s;
    }
}


// if you find it useful please upvote 
 