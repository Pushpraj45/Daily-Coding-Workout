class Solution {
    public int maxScore(int[] cardPoints, int k) {
        /* TLE 
     int maxSum=0;
     int n=cardPoints.length;
     for(int left=0;left<=k;left++){
         int right=k-left;
         int leftSum=helper(cardPoints,0, left);
         int rightSum=helper(cardPoints, n-right, n);
         maxSum=Math.max(maxSum, leftSum+rightSum);
     }  
     return maxSum;
    }
    public int helper(int [] arr, int start, int end){
        int sum=0;
        for(int i=start; start<end;start++){
            sum+=arr[start];
        }
        return sum;
        */ 

        int n=cardPoints.length;
        int left = k-1, right=n-1;

        int temp = 0;
        for(int i=0; i<k; i++){
            temp+=cardPoints[i];
        }

        int max = temp; // Initialized max to temp 

        for(int i=0; i<k; i++){
            temp+=(cardPoints[right]-cardPoints[left]);
            max = Math.max(temp,max); // left ya right jo max de use rakh lo yaha 

            left--;
            right--;
        }

        return max; 

    }
}