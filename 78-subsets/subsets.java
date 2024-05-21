class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> ans=new ArrayList<>();
        getsubsets(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    private void getsubsets(int i, int[] arr, List<Integer> ds, List<List<Integer>>ans){
        if(i == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        ds.add(arr[i]);
        getsubsets(i+1,arr,ds,ans); // Pick condition
        ds.remove(ds.size()-1);
        getsubsets(i+1,arr,ds,ans); // Not pick
    }

    
}