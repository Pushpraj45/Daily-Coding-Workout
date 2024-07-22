class Solution {
   public int[][] merge(int[][] intervals) {
       
   	// sort our intervals 
    Arrays.sort(intervals, (o1,o2)->o1[0]-o2[0]);

        ArrayList<int[]> ans = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        int i = 1;
        while(i<intervals.length){
            int s = intervals[i][0];
            int e = intervals[i][1];
                // if next interval start is smaller then previous interval end and the array is sorted then we can merge them

            if(s<=end){
                end = Math.max(end, e); 
            }
            else{
                ans.add(new int[]{start, end});
                start = s; // updating for next interval
                end = e;
            }
            i++;
        }
        ans.add(new int[]{start, end});
        int arr[][] = new int[ans.size()][];
        for(int k =0; k<ans.size(); k++){
            int ar[] = new int[2];
            for(int j=0; j<2; j++){
                ar[j] = ans.get(k)[j];
            }
            arr[k] = ar;
        }

        return arr; 
   	
   	 // or 
   	 //  return ans.toArray(new int[0][]);
       
       
       
   }
}