class Solution {
    public int prefixCount(String[] words, String pref) {
     int ans = 0;
     for(String s:words){
         if(s.indexOf(pref)==0){
             ans++;
         } 
     }   
     return ans;
    }

    /*
    int count=0;
        for(int i=0;i<words.length;i++)
        {
            if(words[i].startsWith(pref))
            count++;
        }
        return count;
    */
}

