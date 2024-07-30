class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max = arr[0];
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(arr[i], max);
            if(i==max){ans++;}
        }

        return ans;
    }
}