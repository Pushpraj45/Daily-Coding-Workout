class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums;
        }
        int[] result  = new int[n];

       ArrayList<Integer> pos=new ArrayList<>();
       ArrayList<Integer> neg=new ArrayList<>();

        for(int i=0; i<n; i++){
            if(nums[i]>=0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }

        int k=0, l=0;
       for(int i=0; i<n; i++){
           if(i%2==0){
               result[i]  = pos.get(k);
               k++;
           }
           else{
               result[i] = neg.get(l);
               l++;
           }
       }
        return result;

    }
}