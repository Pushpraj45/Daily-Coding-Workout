class Solution{
    public void printsubsetsum2(int index,int nums[],List<List<Integer>> ans,ArrayList<Integer> ds){
        ans.add(new ArrayList<>(ds));

        //main
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            printsubsetsum2(i+1,nums,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        printsubsetsum2(0,nums,ans,new ArrayList<>());
        return ans;

    }
}