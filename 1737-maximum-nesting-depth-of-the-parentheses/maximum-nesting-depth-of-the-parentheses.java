class Solution {
    public int maxDepth(String s) {
        int counter = 0;
        int maxCounter = Integer.MIN_VALUE;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                counter++;
            }
            else if(s.charAt(i)==')'){
                counter--;
            }
        maxCounter=Math.max(counter,maxCounter);

        }
        return maxCounter;
    }
}