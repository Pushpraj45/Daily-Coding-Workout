class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();

        for(int[] i:intervals){
            if(newInterval == null || i[1]<newInterval[0]){ // Simply push to your ans
                res.add(i);
            }
            else if(i[0]>newInterval[1]){
                res.add(newInterval);
                res.add(i);
                newInterval = null;
            }
            else{
                 newInterval[0] = Math.min(newInterval[0], i[0]);//get min
                 newInterval[1] = Math.max(newInterval[1], i[1]);//get max
            }


        }

        if(newInterval!=null){
             res.add(newInterval);
        
        }
        return res.toArray(new int[res.size()][]);
    }
}