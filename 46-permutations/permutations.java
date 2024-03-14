class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length]; // to check which element has been taken and which is left

        func(nums, ds, ans, freq);

        return ans;
    }

    private void func(int[] arr, List<Integer> ds, List<List<Integer>> ans, boolean[] f){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0; i<arr.length; i++){
            if(f[i]!=true){
                f[i]=true;
                ds.add(arr[i]);
                func(arr,ds,ans,f); // again calling so that hamare ds mein sab store rahe
                ds.remove(ds.size()-1); // repetative permutations nahi aane chahiye na 
                f[i] = false;
            }
        }
    }
}