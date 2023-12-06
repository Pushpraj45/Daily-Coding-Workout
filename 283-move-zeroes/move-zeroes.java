class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                arr.add(nums[i]);
            }
        }

        int s = arr.size();

        for(int i=0; i<s; i++){
            nums[i]=arr.get(i);
        }

        for(int i=s; i<nums.length; i++){
            nums[i] = 0;
        }


    }
}