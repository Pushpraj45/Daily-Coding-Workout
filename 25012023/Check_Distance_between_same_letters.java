class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character, Integer> map=new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i);
            }
            // Updating the distnace between the current and previous occourence of key if it contains it 
            else{
                int prev = map.get(s.charAt(i));
                int index = s.charAt(i)-'a';
                // Checking is the computed distance matches with provided distance
                if(distance[index]!=i-prev-1){
                    return false;
                }
            }
        }
          return true;
    }
}