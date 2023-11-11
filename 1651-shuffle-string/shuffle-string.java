class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        StringBuilder sb  = new StringBuilder("");
        char[] c = new char[n];

        for(int i=0; i<n; i++){
            c[indices[i]] = s.charAt(i);
        }
//        c = {l,e,e,t,c,o,d,e}
        sb.append(c);
        return sb.toString();
    }
}