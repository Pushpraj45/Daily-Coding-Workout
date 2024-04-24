class Solution {
    public int longestOnes(int[] nums, int k) {
        // int start = 0;
        // int end = 0;
        // int countzeroes = 0;

        // while(end<nums.length){
        //     if(nums[end]==0){
        //         countzeroes++;
        //     }
        //     end++;

        //     // if zeroes are crossing k then remove the calc of all zeroes
        //     if(countzeroes>k){
        //         if(nums[start]==0){
        //             countzeroes--;

        //         }

        //         start++;
        //     }
        // }

        // return end-start; // or we can count max value above also 
         int l=0,r=0,max=0,zero=0,n=nums.length;
        while(r<n){
            if(nums[r]==0) zero++;
            if(zero>k){
            if(nums[l]==0) zero--;
                l++;
            }
            if(zero<=k){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
    return max;

    }
}