class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char best = keysPressed.charAt(0);
        int maxDifference = releaseTimes[0];

        for(int i=1; i<releaseTimes.length; i++){
            int diff = releaseTimes[i]-releaseTimes[i-1];
            if(diff>maxDifference || (diff == maxDifference && best<keysPressed.charAt(i))){
                maxDifference = diff;
                best = keysPressed.charAt(i);
            }
        }

        return best;
    }
}