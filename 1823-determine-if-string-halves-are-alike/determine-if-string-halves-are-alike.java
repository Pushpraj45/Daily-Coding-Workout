class Solution {
    public boolean halvesAreAlike(String s) {
         HashSet<Character> set = new HashSet<>();
         for(char c: "aeiouAEIOU".toCharArray()){
             set.add(c);
         }
    int ans=0;
         for(int i=0; i<s.length()/2; i++){
             if(set.contains(s.charAt(i))) ans++;
             if(set.contains(s.charAt(i+s.length()/2))) ans--;
         }

         return ans==0;

    }
}