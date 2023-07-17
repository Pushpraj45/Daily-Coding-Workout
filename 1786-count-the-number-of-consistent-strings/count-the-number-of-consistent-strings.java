// class Solution {
//     public int countConsistentStrings(String allowed, String[] words) {
//        int[] char_map = new int[26];
//        ArrayList<String> size = new ArrayList<>();
//        for(char c:allowed.toCharArray()){
//            char_map[c-'a']++;
//        } 
//        for(String word:words){
//            int[] check = new int[26];
//            for(char c: word.toCharArray()){
//                check[c-'a']++;
//            }

//            for(int i=0; i<char_map.length; i++){
//                if(check[i]-char_map[i]>0){
//                    size.add(word);
//                    break;
//                }
//            }
//        }
//        return size.size();
//     }
// }

class Solution{
    public int countConsistentStrings(String allowed, String[] words) {

        // Creating an array in which if character exist in allowed array then in that place value will be true
    boolean[] char_map = new boolean[26];
    for(int i=0; i<allowed.length(); i++){
        char_map[allowed.charAt(i)-'a'] = true;
    }

    // traverse words array, and for each word...
    // 1. look at each character and check if the corresponding position in the array is true(if the char is in strong allowed )
    // 2. if false, break and continue to the next word

    int count=0;
    for(int i=0; i<words.length; i++){
        String word = words[i];
        int temp = 0;
        while(temp < word.length()){
            char c = word.charAt(temp);
            if(!char_map[c-'a'])
            break;
            temp++;
        }
        if(temp>=word.length()){
            count++;
        }
    }
     return count;
}
}