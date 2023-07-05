class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), i);
        }

        List<Integer> ans = new ArrayList<>();
        int i=0,j=0;
        for(int k=0; k<s.length(); k++){
            j=Math.max(j, map.get(s.charAt(k)));

            if(k==j){
                ans.add(j-i+1);
                i=k+1;
            }
        }
        return ans;
        
        
}
}