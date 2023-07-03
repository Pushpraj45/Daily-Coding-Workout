class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        /*
        0 <= numOnes, numZeros, numNegOnes <= 50
        0 <= k <= numOnes + numZeros + numNegOnes
        */
        // int arr=0;
        if(k==0){
            return 0;
        }


        // int min = Math.min();

        int arr[] = new int[numOnes+numZeros+numNegOnes];
        int i=0; 
        while(numOnes>0){
            arr[i] = 1;
            numOnes--;
            i++;
        }
          while(numZeros>0){
            arr[i] = 0;
            numZeros--;
            i++;
        }
          while(numNegOnes>0){
            arr[i] = -1;
            numNegOnes--;
            i++;
        }
        int sum=0;
        int j=0;

        while(k>0){
            sum+=arr[j];
            j++;
            k--;
        }  
        return sum;
    }
}