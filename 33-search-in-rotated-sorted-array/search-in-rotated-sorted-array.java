class Solution {
    public int search(int[] nums, int target) {
        int min = FindRotation(nums);
        int ans1 = BinarySearch(nums, 0, min-1, target);
        int ans2 = BinarySearch(nums, min, nums.length-1, target );
         
        return ans1==-1?ans2:ans1;
    }
    public int FindRotation(int[] nums){
        int start=0;
        int end = nums.length-1;
          int prev;
          int next;
          int N = nums.length;
     

        while(start<=end){
            
            int mid = start+(end-start)/2;
            prev=(mid-1+N)%N;
            next = (mid+1)%N;


            if(nums[mid]<=nums[prev] && nums[mid]<=nums[next]){
                return mid;
            }

            else if(nums[mid]>=nums[0]){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return 0;

    }
    public int BinarySearch(int[] nums, int start, int end, int target){
    
        while(start<=end){
            int mid = start+(end-start)/2;

            if(nums[mid]==target){
                return mid;
            }

            else if(nums[mid]<=target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        
        }
        return -1;
    }
}

