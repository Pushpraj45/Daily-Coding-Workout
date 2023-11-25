class Solution {
    public int minSteps(String s, String t) {
        if(s.equals(t)){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        int ans = 0;

        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);

            if(map.containsKey(c) && map.get(c)>0 ){
                map.put(c, map.get(c)-1);
            }
            else{
                ans++;
            }
        }
        return ans; 
    }
}