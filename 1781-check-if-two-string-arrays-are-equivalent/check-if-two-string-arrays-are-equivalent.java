class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //  Two StringBuilders to append all words of word1 and word2 

        StringBuilder w1 = new StringBuilder("");
        StringBuilder w2 = new StringBuilder("");

        for(String s:word1){
            w1.append(s);

        }
        for(String s:word2){
            w2.append(s);
        }

        return w1.toString().equals(w2.toString());
    }
}