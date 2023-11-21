class Solution {
    public String makeSmallestPalindrome(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<len; i++){
            sb.append(Character.toString(Math.min(s.charAt(i), s.charAt(len-i-1))));


        }

        return sb.toString();
    }
}
