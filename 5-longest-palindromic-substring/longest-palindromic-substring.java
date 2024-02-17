class Solution {
    public String longestPalindrome(String s) {
        int n= s.length();
        int maxx = 0;
        String ans = "";
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                String sub = s.substring(i,j);
                if(palindrome(sub) && sub.length()>maxx){
                    maxx = sub.length();
                    ans = sub;
                }
            }
        }
    return ans;

    }

    public static boolean palindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}