class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        
    int n = answerKey.length();
        int[] hash = new int[26]; 
        int maxlen = 0;
        int maxfreq = 0;
        int left = 0; 

        
        for (int right = 0; right < n; ++right) {
            hash[answerKey.charAt(right) - 'A']++; 
            maxfreq = Math.max(maxfreq, hash[answerKey.charAt(right) - 'A']); 

            
            if ((right - left + 1) - maxfreq > k) {
                hash[answerKey.charAt(left) - 'A']--; 
                left++;
            }

            maxlen = Math.max(maxlen, right - left + 1); 
        }

        return maxlen;
    }
}