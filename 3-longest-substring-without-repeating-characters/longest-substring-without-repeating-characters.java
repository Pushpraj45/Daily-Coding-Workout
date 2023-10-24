class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int ans = 0;

        HashMap<Character, Integer> hm = new HashMap<>();
        while(j<s.length()){
            char ch = s.charAt(j);
            hm.put(ch, hm.getOrDefault(ch,0)+1);

            if(hm.size() == j-i+1){
                ans = Math.max(ans, j-i+1);
                j++;
            }
            else if(hm.size()< j-i+1){
                while(hm.size()< j-i+1){
                    char c = s.charAt(i);
                    hm.put(c, hm.get(c)-1);
                    if(hm.get(c)==0){
                        hm.remove(c);

                    }
                    i++;
                }
                if(hm.size()==j-i+1){
                    ans = Math.max(ans, j-i+1);
                }
                j++;
            }
        }
        return ans;
    }
}