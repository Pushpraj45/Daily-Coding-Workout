class Solution {
    public int numberOfSubstrings(String s) {
        int ans = 0;
        int ptr1 = 0;
        int ptr2 = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        int n = s.length();

        while(ptr2<n){
            char ch = s.charAt(ptr2);
            // Putting all the chars in map 
            map.put(ch, map.getOrDefault(ch,0)+1);
            // Checking substring with atleast one a,b or c
            while(map.getOrDefault('a',0)>0 && map.getOrDefault('b',0)>0 && map.getOrDefault('c',0)>0){
                ans += n-ptr2; // Itni hi substring now we can make after this 
            //  Removing calculations of start with ptr1
            ch = s.charAt(ptr1);
            map.put(ch, map.get(ch)-1);
            ptr1++;
            }

            ptr2++;

          
        }

        return ans;
    }
}