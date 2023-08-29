// class Solution {
//     public int search(int[] nums, int target) {
// //         min will have index of minimum element of nums
//         int min=minSearch(nums);
// //             find in sorted left
//         if(nums[min]<=target && target <=nums[nums.length-1]){
//             return search (nums, min, nums.length-1, target);
//         }
// //         find in sorted right
//         else{
//             return search(nums, 0, min, target);
//         }
//     }
// //     binary search to find target in left to right boundary
//     public int search(int[] nums, int left, int right, int target){
//         int l=left;
//         int r=right;
        
// //         System.out.println(left+" "+right)
//         while(l<=r){
//             int mid=l+(r-1)/2;
//             if(nums[mid]==target){
//                 return mid;
//             }
//             else if(nums[mid]>target){
//                 r=mid-1;
//             }
//             else{
//                 l=mid+1;
//             }
//         }
//         return -1;
//     }
// //     Smallest element index
//     public int minSearch(int[] nums){
//         int left=0;
//         int right=nums.length-1;
//         while(left<right){
//             int mid=left+(right-left)/2;
//             if(mid>0 && nums[mid-1]>nums[mid]){
//                 return mid;
//             }
//             else if(nums[left]<=nums[mid] && nums[mid]>nums[right]){
//                 left=mid+1;
//             }
//             else{
//                 right=mid-1;
//             }
//         }
//             return left;

//     }
// // }

// class Solution {
//     public int search(int[] nums, int target) {

//         if (nums.length == 0) {
//             return -1;
//         }

//         int start = 0;
//         int end = nums.length - 1;

//         while (start <= end) {

//             int mid = start + (end - start) / 2;
//             int currNum = nums[mid];

//             if (currNum == target) {
//                 return mid;
//             }

//             if (nums[start] <= currNum) {

//                 if (target >= nums[start] && target < currNum) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }

//             } else {
        
//                 if (target > currNum && target <= nums[end]) {
//                     start = mid + 1;
//                 } else {
//                     end = mid - 1;
//                 }
//             }
//         }
//         return -1;
//     }

// }


class Solution {
    public int search(int[] nums, int target) {
        int si=0;
        int ei=nums.length-1;
        return BS(nums, target, si, ei);
    
    }
    public static int BS(int[] arr, int target, int si, int ei){
         // Base case
        if(si>ei){
            return -1;
        }

        // Work
        int mid = si+(ei-si)/2;

        if(arr[mid]==target){
            return mid;
        }

        // mid on L1
        if(arr[si]<=arr[mid]){
            // case a : Left
            if(arr[si]<=target && target<=arr[mid]){
                return BS(arr,target, si, mid);
            }
            else{
                // case b:right
                return BS(arr, target, mid+1, ei);
            }
        }
        // mid on L2
        else{
            // case c: right
            if(arr[mid]<=target && target<=arr[ei]){
                return BS(arr, target,  mid+1,ei);
            }
            else{
                // case d: left
                return BS(arr,target,si,mid-1);
            }
        }
    }
    }