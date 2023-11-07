class Solution {
    public int maximumTastiness(int[] price, int k) {
        // Let us sort the array first we are applying Greedy Sort + Binary Search 
        Arrays.sort(price);
        int start = 0;
        int end = price[price.length-1];
        int ans = -1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(minimumfork(mid,price, k)){
                ans = mid;
                start = mid+1; 
            }
            else{
                end = mid-1;
            }
         
        }   return ans; }


    
    public boolean minimumfork(int mid, int[] arr, int k){
        int temp = arr[0];
        int c = 1;

        for(int i=1; i<arr.length; i++){
            if(arr[i]-temp>=mid){
                c++;
                temp = arr[i];
            }
        }
        if(c>=k){
            return true;
        }
        return false;
    }
}