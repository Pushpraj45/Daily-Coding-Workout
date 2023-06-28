// import java.util.*; 
class Solution {
    public int maximizeSum(int[] nums, int k) {
        int ans=0;
        // Finding max in the array 
        for(int i=0; i<nums.length; i++){
            ans=Math.max(ans,nums[i]);
        }
        int res=0;

        // Adding ans in res ans incrementing it till loop runs at k 
        for(int i=0; i<k; i++){
            res+=ans;
            ans++;
        }
        return res;
    }
}