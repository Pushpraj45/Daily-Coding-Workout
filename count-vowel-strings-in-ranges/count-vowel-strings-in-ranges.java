class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
         int n = words.length;
        int[] prefix = new int[n+1];
        for(int i=0; i<n; i++){
            prefix[i+1] = prefix[i] + (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length()-1)) ? 1 : 0);
        }
        
        int[] res = new int[queries.length];
        for(int i=0; i<queries.length; i++){
             res[i] = prefix[queries[i][1]+1] - prefix[queries[i][0]];
        }
        return res;
    
    }
    public boolean isVowel(char vo){
        return vo == 'a' || vo =='e' || vo =='i' || vo == 'o' || vo =='u';
    }
}