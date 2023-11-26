class Solution {
    public List<String> stringMatching(String[] words) {
        HashSet<String> st = new HashSet<>();

        for(int i=0; i<words.length; i++){
            String w = words[i];
            for(int j=0; j<words.length; j++){
                if(i!=j && words[j].contains(w)){
                    st.add(w);
                }
            }
        }
        return new ArrayList<>(st); 
    }
}