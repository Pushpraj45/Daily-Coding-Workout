class Solution {
    public int countSeniors(String[] details) {
        /* Solution - 1
        int m = 0; int a=0;
        for(String s:details){
            int g = (s.charAt(11)-'0')*10+(s.charAt(12)-'0');
            if(g>60){
                m++;
            }
        }

        return m;
        */
        int ans = 0;
        for(String s:details){
            String d = s.substring(11,13);
            int age = Integer.parseInt(d);
            if(age>60){
                ans++;
            }
        }
        return ans;
    }
}