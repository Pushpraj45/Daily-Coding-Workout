class Solution {
    public int minTimeToType(String word) {
        int minsec = 0;
        // Variable to fiind exaclty where pointer is currently pointing
        char currentChar = 'a';
        int ans = 0;
        // will find both counterclockwise and clockwise and then will take minimum of both of them 
        for(char i:word.toCharArray()){
            int clock = Math.abs(i-currentChar);
            int counterclock = 26-Math.abs(i-currentChar);

            minsec=Math.min(clock, counterclock);
            // Updating current character from a to i(selected one)
            ans+=minsec;
            currentChar = i;
            ans++; 
        }
        return ans;


    }
}