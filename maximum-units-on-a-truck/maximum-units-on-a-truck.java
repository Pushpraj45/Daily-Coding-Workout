class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // boxtypes[i] = [n,numberofunits/box];
        // 5*10+3*9+2*7

        // Approach 
        /*
        1. Sort based upon the numberofboxes in an array 
        2. add the boxes which are higher 
        3. decrement the trucksize from number of boxes 
        */

        Arrays.sort(boxTypes, (a,b) -> b[1]-a[1]);
        int ans = 0;
        int boxes = 0; // Count to get till now how many boxes have been selected 

        for(int i=0; i<boxTypes.length; i++){
            if(boxes+boxTypes[i][0]<=truckSize){
                ans+=boxTypes[i][0]*boxTypes[i][1];
                boxes+=boxTypes[i][0];
            }
            else{
                ans+=(truckSize-boxes)*boxTypes[i][1];
                break;
            }
        }
        return ans;

        




    }
}