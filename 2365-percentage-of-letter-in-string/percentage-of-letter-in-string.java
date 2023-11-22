class Solution {
    public int percentageLetter(String s, char letter) {
        int len = s.length();
        int count=0;
        for(char c:s.toCharArray()){
            if(c==letter){
                count++;
            }
        }

        if(count==0){
            return 0;
        }

        int ans = (count*100)/len;
        return ans;
    }
}