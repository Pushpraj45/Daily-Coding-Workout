class Solution {
    public int maximumXOR(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length; i++){
            result=result|nums[i];
        }
        return result;
    }
}