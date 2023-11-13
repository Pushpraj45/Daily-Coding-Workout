class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }

        return helping(nums,0,0);


    }
    private int helping(int[] arr, int i, int x){
        // Base Case
        if(i==arr.length){
            return x;
        }

        // with all elements 
        int elementsall = helping(arr, i+1, x^arr[i]); // Each Subset is being calculated here

        int individualelements = helping(arr, i+1, x); // Ek ek element ka xor to vahi hoga na

        return elementsall+individualelements;  
    }
}