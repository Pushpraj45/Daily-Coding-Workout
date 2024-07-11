class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long)m*k;

        if(bloomDay.length<val){
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<bloomDay.length; i++){
            min = Math.min(bloomDay[i], min);
            max = Math.max(bloomDay[i], max);
        }

        int low = min;
        int high = max;

        while(low<=high){
            int mid = (low+high)/2;

            if(helper(bloomDay, mid, m, k)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return low;
    }

    public boolean helper(int[] arr, int day, int m, int k){
        int boq = 0;
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                boq+=(count/k);
                count=0;
            }
        }
        boq+=(count/k);

        return boq>=m;

    }
}