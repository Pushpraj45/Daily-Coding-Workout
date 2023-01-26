

class Solution {
    public int[] char_map;
    public int countCharacters(String[] words, String chars) {
        char_map=new int[26];
       int ans=0;
       for(char c : chars.toCharArray()){
           char_map[c-'a']++;
       }

       for(String word: words){
           int[] dummyArray = Arrays.copyOf(char_map, char_map.length);
           int count =0;
           for(char c: word.toCharArray()){
               if(dummyArray[c-'a']>0){
                   count++;
                   dummyArray[c-'a']--;
               }
           }
           if(count==word.length()){
               ans+=word.length();
           }
       }
       return ans;
    }
}