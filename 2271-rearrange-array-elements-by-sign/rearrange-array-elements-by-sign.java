class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }

        for(int i=0; i<nums.length/2; i++){
            nums[2*i] = pos.get(i);
            nums[2*i+1] = neg.get(i);
        }

        return nums;

    }
}