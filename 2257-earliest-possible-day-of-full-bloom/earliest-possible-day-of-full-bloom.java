class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
      int n=growTime.length;
      int arr[][] = new int[n][2];

      for(int i=0; i<n; i++){
          arr[i][0] = growTime[i];
          arr[i][1] = plantTime[i];
      }

      Arrays.sort(arr, (a,b) -> b[0]-a[0]);

      int curr = 0;
      int total = 0;

      for(int i=0; i<n; i++){
          total = Math.max(total, curr+arr[i][0]+arr[i][1]);
          curr+=arr[i][1];
      }

      return total;
    }
}