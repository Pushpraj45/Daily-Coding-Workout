class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findcombinations(0, candidates, target, ans, new ArrayList<>()); // helper function

        return ans;
    }

    private void findcombinations(int i, int[] arr, int k, List<List<Integer>> ans, List<Integer> ds){
        if(i==arr.length){
            if(k==0){
                ans.add(new ArrayList<>(ds)); // We got a combination that sums up to 0
            }

            return;
        }

        if(arr[i]<=k){
            ds.add(arr[i]);
            findcombinations(i,arr,k-arr[i],ans,ds); // Picked up and calling for next
            ds.remove(ds.size()-1); // Removing so that we can go for all combinations 
        }

        findcombinations(i+1,arr,k,ans,ds);
    }
}