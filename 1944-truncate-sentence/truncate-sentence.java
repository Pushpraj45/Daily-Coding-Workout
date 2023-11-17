class Solution {
    public String truncateSentence(String s, int k) {
        int len = s.length();

        int c = 0;
        int index = 0;
        while(index<len){
            if(s.charAt(index)==' '){
                c++;

                if(c==k){
                    return s.substring(0,index);
                }
            }
            index++;
        }
        return s;
    }
}
