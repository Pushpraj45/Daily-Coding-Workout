class Solution {
    public String sortSentence(String s) {
         String[] words = s.split(" ");
        String[] bucket = new String[words.length];
        
        for (String word : words) {
            int index = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
            bucket[index] = word.substring(0, word.length() - 1);
        }
        
        StringBuilder result = new StringBuilder();
        
        for (String word : bucket) {
            result.append(word).append(" ");
        }
        
        // Delete the trailing space
        result.deleteCharAt(result.length() - 1);
        
        return result.toString();

    }
}