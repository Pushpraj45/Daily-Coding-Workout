// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         // for(int i = 0; i < nums.length; i++)
//         //     if(nums[i] == target) return i;
//         //     else if(nums[i] > target) return i;
        
//         // return nums.length;

//         int i=0; 
//         int j=nums.length-1;

//         while(i<=j){
//             int mid = (i+j)/2;

//             if(nums[mid]==target){
//                 return mid;
//             }

//             else if(nums[mid]>target){
//                j=mid-1;
//             }
// else{
//            i=mid+1;
//            }
//         }
//         return i;
//     }
// }
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;
    }
}