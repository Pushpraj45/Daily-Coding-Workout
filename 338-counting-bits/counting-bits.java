class Solution {
    public int[] countBits(int n) {
        // Approach - 1
        int[] ans = new int[n+1];

        // for(int i=1; i<=n; i++){
        //     if(i%2==0){
        //         ans[i] = ans[i>>1];
        //     }
        //     else{            
        //     ans[i] = ans[i>>1]+1;}
        // }
        

        // Approach - 2
        for(int i=1; i<=n; i++){
            ans[i] = ans[i>>1] + (i&1);  
        }
        return ans;

    }
}