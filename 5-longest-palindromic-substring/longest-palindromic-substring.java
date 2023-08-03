class Solution {
    public String longestPalindrome(String s) {
       int n = s.length();
        int maxLen = 0;
        String maxSubstring = "";

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = s.substring(i, j);
                if (isPalindrome(substring) && substring.length() > maxLen) {
                    maxLen = substring.length();
                    maxSubstring = substring;
                }
            }
        }

        return maxSubstring;


    }
    public static boolean isPalindrome(String s){
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