class Solution {
    public int maxVowels(String s, int k) {
        int i = 0; 
        int j = 0; 
        char[] ch = s.toCharArray();
        int vowel = 0;
        int maxVowels = 0;

        while (j < s.length()) {
            
            if (isVowel(ch[j])) {
                vowel++;
            }

           
            if (j - i + 1 > k) {
                if (isVowel(ch[i])) {
                    vowel--;
                }
                i++;
            }

           
            if (j - i + 1 == k) {
                maxVowels = Math.max(maxVowels, vowel);
            }

            j++;
        }

        return maxVowels;
    }
     private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}