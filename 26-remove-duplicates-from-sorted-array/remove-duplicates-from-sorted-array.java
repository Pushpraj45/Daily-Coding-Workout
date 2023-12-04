class Solution {
    public int removeDuplicates(int[] arr) {
        int ans = 0;
        for(int j=1; j<arr.length; j++){
            if(arr[ans]!=arr[j]){
                ans++;
                arr[ans]=arr[j];
            }
            
        }
        return ans+1;
    }
}