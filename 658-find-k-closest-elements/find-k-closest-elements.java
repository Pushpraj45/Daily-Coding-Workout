class Pair{
    int diff,element;
    Pair(int diff,int element){
        this.diff = diff;
        this.element = element;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b) -> (a.diff == b.diff ?  b.element - a.element : b.diff - a.diff));
        //agr do element ka diff same hai to usme se jo bada hai vo ooper aaega
        for(int i=0;i<arr.length;i++){
            pq.add(new Pair(Math.abs(arr[i]-x),arr[i]));
            if(pq.size() > k){
                pq.poll();
            }
        }
        List<Integer> list = new ArrayList<>();
        while(pq.size()>0){
            list.add(pq.poll().element);
        }
        Collections.sort(list);
        return list;
    }
}

/*
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<Integer>();
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int start =-1,end = -1;


       while(j<arr.length) {
            //**Step 1:** calculation related to j
            int jVal = Math.abs(x-arr[j]);
            sum += jVal;

            if(j-i+1<k) {
               //**Step 2:** till we hit window size keep increasing j    
              j++;
            } else if(j-i+1==k){
                //**Step 3:** when window size is achieved then we need   
                //to do calculation to get minSum & store i , j index for  
                //that min sum
                if(sum < minSum){
                    minSum = sum;
                    start =i;
                    end =j;
                }

                //**Step 4:** remove ith value from current window sum  
                //before sliding the window
                int iVal = Math.abs(x-arr[i]);
                sum -= iVal;

                //**Step 5:** slide the window
                j++;    
                i++;
            }
        }

        //**Step 6:** store all values of minSum in result list
        for (int m = start; m <= end; m++) {
            result.add(arr[m]);
        }

        //**Step 7:**
        return result;
    }
}
*/