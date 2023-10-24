class Solution {
    public String minWindow(String s, String t) {
        String ans = "";
        int i=0, j=0;
        int min = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int k=0; k<t.length(); k++){
            // t string ke chars ko store kar liya with chars and their freq in a map
            char ch = t.charAt(k);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int count = map.size();

        while(j<s.length()){
            char c = s.charAt(j);
            if(!map.containsKey(c)){
                // Hame key nahi mili to j ko increment kar diya 
                j++;
                continue;
            }
            else if(map.containsKey(c)){
                // Key milne par use map se minus kar diya uski freq ke saath
                map.put(c, map.get(c)-1);
                // if freq 0 ho gyi to map ka size bhi kam ho jayega so count-- our substring is ready kindoff
                if(map.get(c)==0){
                    count--;
                }
            }
            if(count==0){
                if(min>j-i+1){
                    ans = s.substring(i, j+1);
                    min = Math.min(min, j-i+1);

                }
                while(count == 0){
                    char c1 = s.charAt(i);
                    if(!map.containsKey(c1)){
                        i++;
                    }
                    else{

                        map.put(c1, map.get(c1)+1);
                        if(map.get(c1)>0){
                            count++;
                        }
                        i++;
                    }
                    if(count==0){
                        if(min>j-i+1){
                            ans=s.substring(i, j+1);
                            min = j-i+1;
                        }
                    }
                }
            
            }
            j++;
        }
        return ans; 
    }
}