class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Base Cases 
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        // Till above we passed 8 testcases lol !!!
        int start = 1;
        int end = nums.length-2; // here we are excluding the 0 and n-1 to remove that uncertainity 

        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if(mid%2==0 && nums[mid] == nums[mid+1] || mid%2==1 && nums[mid] == nums[mid-1]){
                // We have to move on right side 
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }


         return -1;
    }
}