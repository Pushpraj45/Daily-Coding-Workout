class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> codes= new HashSet();
        String[] Morsecodes = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for(String s:words){
            StringBuilder sb = new StringBuilder();
            for(char ch : s.toCharArray()){
                sb.append(Morsecodes[ch-'a']);
            }

            codes.add(sb.toString());
        }
        return codes.size();
    }
}