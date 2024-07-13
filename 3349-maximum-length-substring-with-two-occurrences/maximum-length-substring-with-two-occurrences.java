class Solution {
    public int maximumLengthSubstring(String s) {
       int i =0;
       int j =0;

       int ans = 0;
       char[] freq =new char[26];
       while(j<s.length()){
            char ch = s.charAt(j);
            freq[ch-'a']++;

            if(freq[ch-'a']<=2){
                ans = Math.max(ans, j-i+1);
                j++;
            }
            else{
            while(freq[ch-'a']>2){
                freq[s.charAt(i)-'a']--;
                i++;
            }
            j++;
            }
       }

       return ans;
    }
}