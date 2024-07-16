class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
      Map<String, Integer> occurrences = new HashMap<>();
        int[] countLetters = new int[26];
        int countUnique = 0;
        int left = 0;
        int maxFreq = 0;

        for (int right = 0; right < s.length(); right++) {
            char r = s.charAt(right);
            countLetters[r - 'a']++;
            
            if (countLetters[r - 'a'] == 1) {
                countUnique++;
            }

            while ((right - left + 1) > minSize) {
                char l = s.charAt(left);
                countLetters[l - 'a']--;
                
                if (countLetters[l - 'a'] == 0) {
                    countUnique--;
                }
                left++;
            }

            if ((right - left + 1) == minSize && countUnique <= maxLetters) {
                String substring = s.substring(left, right + 1);
                occurrences.put(substring, occurrences.getOrDefault(substring, 0) + 1);
                maxFreq = Math.max(maxFreq, occurrences.get(substring));
            }
        }

        return maxFreq;

    }
}