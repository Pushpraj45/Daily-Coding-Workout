class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>ans = new ArrayList<>();
        findcombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }

    private void findcombinations(int index, int[] arr, int target,List<List<Integer>>ans, List<Integer> ds ){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index; i<arr.length; i++){
            if(i>index && arr[i]==arr[i-1]){
                continue; // This case is just for not considering duplicate elements and checking for index first
            }

            if(arr[i]>target){
                break;
            }

            ds.add(arr[i]);
            findcombinations(i+1, arr, target-arr[i],ans,ds); // isme hame unique hi combinations find karne hai so ek hi baar recursive function call karenge 
            ds.remove(ds.size()-1); // Removed so that we can maintain the uniqueness and pass the function to other one 
        }
    }
}