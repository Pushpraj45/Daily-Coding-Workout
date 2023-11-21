class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            int l=0; int r = s.length()-1;
                boolean palin = true;

            while(l<r){
                if(s.charAt(l)!=s.charAt(r)){
                    palin=false;
                break;

                    
                }
                l++;
                r--;
            }

            if(palin){
                return s;
            }
            
        }
        return "";
    }
}