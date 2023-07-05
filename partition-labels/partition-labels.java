class Solution {
    public List<Integer> partitionLabels(String s) {
        // HashMap<Character, Integer> map = new HashMap<>();

        // for(int i=0; i<s.length(); i++){
        //     map.put(s.charAt(i), i);
        // }

        // List<Integer> ans = new ArrayList<>();
        // int i=0,j=0;
        // for(int k=0; k<s.length(); k++){
        //     j=Math.max(j, map.get(s.charAt(k)));

        //     if(k==j){
        //         ans.add(j-i+1);
        //         i+=k;
        //     }
        // }
        // return ans;
         Map<Character, Integer> lastIndexMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastIndexMap.put(s.charAt(i), i);
        }

        List<Integer> result = new ArrayList<>();
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastIndexMap.get(s.charAt(i)));

            if (i == end) {
                result.add(end - start + 1);
                start = i + 1;
            }
        }

        return result;
        
}
}