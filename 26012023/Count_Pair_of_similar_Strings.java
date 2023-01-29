class Solution {
    public int similarPairs(String[] words) {
        // Store all words mapping to similar character 
        Map<String, Integer> map= new HashMap<>();
        int res=0;

        // for all words
        for(String word : words){
            boolean[] chars = new boolean[26];
            for(char c: word.toCharArray()){
                chars[c-'a'] = true;
            }

            String s = Arrays.toString(chars);
            if(map.containsKey(s)){
                res+=map.get(s);
            }
            // Store this for future occurences 
            map.put(s, map.getOrDefault(s,0)+1);
        }
        return res;
    }
}