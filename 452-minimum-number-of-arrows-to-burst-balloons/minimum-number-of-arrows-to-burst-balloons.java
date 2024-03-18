class Solution {
    public int findMinArrowShots(int[][] points) {
        //  We will sort this on the basis of end point and then compare the end point and start point and see if they overlap or not 
        if(points.length==0){
            return 0;
        }
        Arrays.sort(points,(a,b) -> a[1]-b[1]); // Sorting on the basis of end
        int end = points[0][1];
        int arrows = 1;
        for(int i=1; i<points.length; i++){
            if(end>=points[i][0] && end<=points[i][1]){ // here the end is greater than the start of current one so just continue
                continue;
            }

            arrows++;
            end = points[i][1]; // updating the end
        }

        return arrows;
    }
}