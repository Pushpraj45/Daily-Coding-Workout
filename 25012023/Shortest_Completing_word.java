class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
       licensePlate = licensePlate.replaceAll("[0-9\s]", "").toLowerCase();
       int[] char_map = new int[26]; // To save the frequency of all letters in licensePlate
       ArrayList<String> list = new ArrayList<>(); // To save all the words that satisfy conditions 
       for(char c : licensePlate.toCharArray()){  // saving frequecny of all letters in licensePLate 
       char_map[c-'a']++;
       }

       for(String word: words){
           int[] dummy = new int[26];  // To save the frequency of all letters of a word 
            boolean found = true;       // flag to skip saving a word if it doesn't satisfy requirement
            for(char c : word.toCharArray()){
                dummy[c-'a']++;
            }

            // check if a word satisfy the requirement (if frequency of all letters in dummy array are >= in chars Array)
            for(int i=0; i<char_map.length; i++){
                if(dummy[i]<char_map[i]){
                    found=false; // Skip word from saving 
                    break;

                }
            }
            if(found){
                list.add(word);
            }
       }
       int min=Integer.MAX_VALUE; int pos=0; // check every word that satisfies requirement and find the shortest one 
       for(int i=0; i<list.size(); i++){
           if(list.get(i).length()<min){
               pos=i;
               min=list.get(i).length();
           }
       }
       return list.get(pos);

    }
}