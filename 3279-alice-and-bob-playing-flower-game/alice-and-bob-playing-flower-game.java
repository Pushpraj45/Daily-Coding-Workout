class Solution {
    public long flowerGame(int n, int m) {
    //    long ans =  (long)m*(long)n/2; 
    //     return ans; 

        long evenx = n/2;
        long eveny = m/2;
        long oddx = (n+1)/2;
        long oddy = (m+1)/2;


        return ((evenx)*(oddy)+(eveny)*(oddx)); 
        /*

        
        */
    }
}