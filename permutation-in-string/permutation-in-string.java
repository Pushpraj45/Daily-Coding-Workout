class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int a=s1.length();
        int b=s2.length();
        if(a>b){
            return false;
        }

        int[] count = new int[26];
        for(int i=0; i<a; i++){
            count[s1.charAt(i)-'a']++;
        }

        for(int i=0; i<b; i++){
            count[s2.charAt(i)-'a']--;
            if(i-a >= 0){
                count[s2.charAt(i-a)-'a']++;
            }
            if(allZeros(count)){
                return true;
            }
        }
            return false;

       
        }
         private boolean allZeros(int[] count){
            for(int i=0; i<26; i++){
                if(count[i]!=0){
                    return false;
                }
               
            }
             return true;
    }
}