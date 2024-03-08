class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int maxlength=0;
        int maxcount = 0;
        int[] charcounts = new int[26];
        
        for(int end = 0; end<s.length(); end++){
            charcounts[s.charAt(end)-'A']++;

            int curr = charcounts[s.charAt(end)-'A'];
            maxcount = Math.max(maxcount,curr);

            // Removing and checking for new if size crosses k
            while(end-start-maxcount+1>k){
                charcounts[s.charAt(start)-'A']--;
                start++;
            }

            maxlength = Math.max(maxlength,end-start+1);

        }

        return maxlength;
    }
}
