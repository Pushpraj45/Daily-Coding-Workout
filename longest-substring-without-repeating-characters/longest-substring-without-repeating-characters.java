class Solution {
    public int lengthOfLongestSubstring(String s) {
        // if(s.length()==0){
        //     return 0;
        // }
        // int count=0;
        // HashMap<Character, Integer> map=new HashMap<>();

        // for(int i=0; i<s.length(); i++){
        //     char ch=s.charAt(i);
        //     map.put(ch, map.getOrDefault(ch,0)+1);
        //      if(map.get(ch)==1){
        //          if(s.substring(0, i)){
        //                  count++;
        // }
        // }
        // }

        // return count;

        Queue<Character> q= new LinkedList<>();
        int ans=0;
        for(char c : s.toCharArray()){
            while(q.contains(c)){
                q.remove();
            }
            q.add(c);
            ans=Math.max(ans,q.size());
        }
        return ans;
    }
}