   class Solution {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
    
    private void quickSort(int[] nums, int start, int end) {
        if (start >= end) return;
        
        int i = start, j = end, pivot = nums[i + (j - i) / 2];
        
        while (i <= j) {
            while (i <= j && nums[i] < pivot) ++i;
            while (i <= j && nums[j] > pivot) --j;
            
            if (i <= j) {
                int tmp = nums[i];
                nums[i++] = nums[j];
                nums[j--] = tmp;
            }
        }
        
        quickSort(nums, i, end);
        quickSort(nums, start, j);
    }
}


