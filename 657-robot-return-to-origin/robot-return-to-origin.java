class Solution {
    public boolean judgeCircle(String moves) {
        int u = 0;
        int l = 0;
        for(char c:moves.toCharArray()){
            if(c=='U'){
                u++;
            }
            if(c=='D'){
                u--;
            }
            if(c=='L'){
                l++;
            }
            if(c=='R'){
                l--;
            }
        }

        return (l==0 && u==0);
    }
}