class Solution {
    public List<List<Integer>> permute(int[] nums) { 
        
        List<List<Integer>> ans = new ArrayList<>();
        // List<Integer> ds = new ArrayList<>();
        // boolean freq[] = new boolean[nums.length]; // to check which element has been taken and which is left

        func(0,nums,ans);

        return ans;
    }
/*
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
                f[i] = false; // Ye jab ek full function call ho chuki hogi tab backtrack karte time ke liye phir se i=2 ke liye hai and so on..
            }
        }
        */ 
    
    private void func(int index, int[] arr, List<List<Integer>> ans){
        if(index == arr.length){
            // copy the ds to ans
            List<Integer> ds = new ArrayList<>();
            for(int i=0; i<arr.length; i++){
                ds.add(arr[i]);
            }

            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index; i<arr.length; i++){
            swap(i,index,arr);
            func(index+1,arr,ans); // Calling to print all permutations
            swap(i,index,arr); // Reswapping while backtracking into the problem
        }
    }

    private void swap(int i, int j, int[] nums){
        int t=nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }


}