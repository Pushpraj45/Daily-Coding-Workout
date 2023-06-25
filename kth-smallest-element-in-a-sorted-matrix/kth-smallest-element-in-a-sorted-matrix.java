class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length; int m = matrix[0].length;
        if(matrix.length==1){
            return matrix[0][0];
        }
        int arr[] = new int[n*m];
        int s=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[s] = matrix[i][j];
                s+=1;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];

    }
}