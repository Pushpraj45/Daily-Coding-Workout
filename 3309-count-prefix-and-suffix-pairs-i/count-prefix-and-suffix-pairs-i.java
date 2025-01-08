class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int mycount=0;
        int len = words.length;
        
        for(int a=0; a<len; a++){
            for(int j=0; j<len; j++){
                if(a<j && isPandS(words[a],words[j])){
                    mycount++;
                }
            }
        }
        return mycount;
    }
    
    public boolean isPandS(String b, String c){
       int len1 = b.length();
        int len2=c.length();
        if(len1>len2){
            return false;
        }
        
        boolean isP = true;
        for(int a=0; a<len1; a++){
            if(b.charAt(a)!=c.charAt(a)){
                isP=false;
                break;
            }
        }
        boolean isS = true;
        for(int a=0; a<len1; a++){
            if(b.charAt(a)!=c.charAt(len2-len1+a)){
                isS=false;
                break;
            }
        }
        return isP && isS;
    }
}