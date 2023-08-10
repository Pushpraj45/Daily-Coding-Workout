class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int ans = 0;
        Map<String, Integer> wordss= new HashMap<>();
// for each loop
        for (String a : words) {
            String rWord = new StringBuilder(a).reverse().toString();
            int cnt = wordss.getOrDefault(rWord, 0);
            ans += cnt;  
            wordss.put(a, cnt + 1);  
        }

        return ans;
    }
}
