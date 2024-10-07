class Solution {
    public int minimumOperations(int[] nums) {
        int ns = 0;
        for(int i:nums){
            if(i%3!=0) ns++;
            else continue;
        }

        return ns;
    }
}