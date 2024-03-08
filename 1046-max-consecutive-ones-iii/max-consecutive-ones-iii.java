class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int countzeroes = 0;

        while(end<nums.length){
            if(nums[end]==0){
                countzeroes++;
            }
            end++;

            // if zeroes are crossing k then remove the calc of all zeroes
            if(countzeroes>k){
                if(nums[start]==0){
                    countzeroes--;

                }

                start++;
            }
        }

        return end-start; // or we can count max value above also 

    }
}