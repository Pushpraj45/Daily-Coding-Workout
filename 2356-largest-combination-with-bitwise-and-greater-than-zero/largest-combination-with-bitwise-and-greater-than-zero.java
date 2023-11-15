class Solution {
    public int largestCombination(int[] candidates) {
        int[] calcones = new int[32];

        for(int c:candidates){
            int index=0;
            while(c!=0){
            if((c & 1) == 1){
                calcones[index] += 1;
            }

            c>>=1;
            index++;

        }
        }
        int ans = 0;

        for(int i=0; i<32; i++){
            ans = Math.max(ans, calcones[i]);
        }

        return ans; 
    }
}