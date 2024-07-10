class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i =0;
        int j=0; 
        int ans=0;
        HashMap<Character, Integer> hm = new HashMap<>();
        while(j<s.length()){
            char c = s.charAt(j);
            hm.put(c,hm.getOrDefault(c,0)+1);

            if(hm.size()==j-i+1){
                ans = Math.max(ans, j-i+1);
                j++;
            }

            else if(hm.size()<j-i+1){
                while(hm.size()<j-i+1){
                    char ch = s.charAt(i);
                    hm.put(ch, hm.get(ch)-1);

                    if(hm.get(ch)==0){
                        hm.remove(ch);
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