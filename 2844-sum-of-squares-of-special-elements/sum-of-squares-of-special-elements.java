class Solution {
    public int sumOfSquares(int[] nums) {
        ArrayList<Integer> special = new ArrayList<>();
        int sum=0;
        int n=nums.length;
        for(int i=1; i<=nums.length; i++){
            if(n%i==0){
                sum=sum+(nums[i-1]*nums[i-1]);
            }
        }
        // for(int i=0; i<special.size(); i++){
        //     sum+=special.get(i)*special.get(i);
        // }
        return sum;
    }
}