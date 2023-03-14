class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        int min = 0;
        int max=piles[n-1];

        while(min<max){
            int mid = (min+max)/2;

            int count = 0; // kitne banana kha sakti hai par less than hours 
            for(int i : piles){
                count += Math.ceil((double)i/mid);
            }

            if(count>h){
                min = mid+1;
            }
            else{
                max = mid;
            }
           
        }
         return min;
    }
}

// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {
//         int hi = Integer.MIN_VALUE;
//         int lo = 1;
//         for(int val: piles){
//             hi = Math.max(hi,val);
//         }
        
//         while(lo < hi){
//             int mid = (lo + hi)/2;
            
//             int par = 0;
//             for(int val:piles){
//                 par += (val + mid - 1)/mid; 
//             }
//             if(par > h){
//                 lo = mid + 1;
//             }else{
//                 hi = mid;
//             }
//         }
        
//         return lo;
//     }
// }