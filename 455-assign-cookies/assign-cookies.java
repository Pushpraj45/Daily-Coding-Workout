class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
       Arrays.sort(g);
       Arrays.sort(s);

       for(int i=0; i<s.length && count<g.length; i++){
           if(s[i]>=g[count]){
               count++;
           }
       }
        return count;
    }
}