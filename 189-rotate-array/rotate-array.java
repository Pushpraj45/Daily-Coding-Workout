class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k %n; // To avoid if k is greater

        reverse(arr,0,n-1); // Reverse entire array
        reverse(arr,0,k-1); // Reverse till kth element
        reverse(arr,k,n-1); // Reverse remaining element


    }

    public void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}