class Solution {
    public String customSortString(String order, String s) {
        StringBuilder res = new StringBuilder(); 
        // Storing all chars of s in map with their frequency 
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }            
            else{
                hm.put(s.charAt(i),1);
            }
        }

        for(int i=0; i<order.length(); i++)
        {
            char c = order.charAt(i);
            if(!hm.containsKey(c)){ // If the char is not present in map then add it in last to maintain custom order
                continue;
            }

            int f = hm.get(c);
            for(int j=0; j<f; j++){
                res.append(Character.toString(c));
            }

            hm.remove(c); // removing the element so that is does not appear again
        }

        for(Character k:hm.keySet()){  // Now add remaining char in ans of s string that are in map code is important 
            int f = hm.get(k);
            for(int j=0; j<f; j++){
                res.append(Character.toString(k));
            }


        }

        return res.toString();
    }
}