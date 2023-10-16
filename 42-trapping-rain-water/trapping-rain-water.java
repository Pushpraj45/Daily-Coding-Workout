class Solution {
    public int trap(int[] height) {
         int trapped = 0;
        // Calculation of leftmax boundary 
        int[] leftmax = new int[height.length];
        leftmax[0] = height[0];
        int n = height.length;
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        // Calcualtion of rightmax boundary 
        int[] rightmax = new int[n];
        rightmax[n-1] = height[n-1];

        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        // Calculation of Trapped Rainwater
        for(int i=0; i<height.length; i++){
            int waterlevel =Math.min(leftmax[i], rightmax[i]);

           
            trapped+=waterlevel - height[i];
        }
        return trapped;
    }
}