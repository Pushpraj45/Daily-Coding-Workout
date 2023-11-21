class Solution {
    public String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch);

        if(i!=-1){
            return revString(i, i+1, word);
        }
        else{
            return word;
        }
    }

    public String revString(int start, int end, String word){
        StringBuilder sb = new StringBuilder();
        while(start>=0){
            sb.append(word.charAt(start--));
        }
        while(end<word.length()){
            sb.append(word.charAt(end++));
        }

        return sb.toString();
    }
   
}