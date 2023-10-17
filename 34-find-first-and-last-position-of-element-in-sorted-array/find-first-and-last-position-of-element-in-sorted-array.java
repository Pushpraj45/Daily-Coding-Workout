class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = findFirstPos(nums, target);
        ans[1] = findLastPos(nums, target);
        return ans;
        
    }
    public int findFirstPos(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        int index = -1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                index=mid;
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return index;
    }
    public int findLastPos(int[] arr, int target){
        int index=-1;
        int start = 0;
        int end= arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                index=mid;
                start= mid+1;

            }
            else if(arr[mid]<target){
                start = mid+1;

            }
            else{
                end = mid-1;
            }
        }
        return index;
    }
}