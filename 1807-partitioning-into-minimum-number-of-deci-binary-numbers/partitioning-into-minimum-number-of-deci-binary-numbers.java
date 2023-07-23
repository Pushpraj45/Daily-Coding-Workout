class Solution {
    public int minPartitions(String n) {
        int ans = 0;
        for(int i=0; i<n.length(); i++){
            ans=Math.max(ans, n.charAt(i)-'0');
        }
        return ans;

        // We just have to find maximum digit in given string 
        /*

        1. Took ASCII value of numbers present in string and then took difference from '0'.
        2. Now it will actually return the max value via comparingg.
        */

        /*
        Another way to find 
        char[] array=n.toCharArray();
        int max=0;
        for(char c:  array){
            int n = Character.getNumericValue(c);
            max=Math.max(n,max);
        }

        return max;

        */
        

    }
}