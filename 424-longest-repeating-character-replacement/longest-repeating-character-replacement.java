class Solution {
    public int characterReplacement(String s, int k) {
        // int start = 0;
        // int maxlength=0;
        // int maxcount = 0;
        // int[] charcounts = new int[26];

        // // Formula used or observed -> len of s - max freq char in s 
        
        // for(int end = 0; end<s.length(); end++){
        //     charcounts[s.charAt(end)-'A']++;

        //     int curr = charcounts[s.charAt(end)-'A'];
        //     maxcount = Math.max(maxcount,curr);

        //     // Removing and checking for new if size crosses k
        //     while(end-start-maxcount+1>k){
        //         charcounts[s.charAt(start)-'A']--;
        //         start++;
        //     }

        //     maxlength = Math.max(maxlength,end-start+1);

        // }

        // return maxlength;

        
        int n = s.length();
        int maxl = 1;
        for(int i=0; i<n; i++){
        int[] freq = new int[26];
        int maxf = 0;
        for(int j=i; j<n; j++){
            freq[s.charAt(j)-'A']++;

            maxf = Math.max(maxf, freq[s.charAt(j)-'A']);

            int window = j-i+1;

            if(window-maxf>k){
                break;
            }

            maxl = Math.max(maxl, window);
        }
        }

        return maxl;
    }
}
