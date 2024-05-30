class Solution {
    public int countTriplets(int[] arr) {
        int count=0;

        for(int i=0; i<arr.length; i++){
            int a=arr[i];
            for(int j=i+1; j<arr.length; j++){
                a^=arr[j];
                 
                    if(a==0)
                    {
                        count+=(j-i);
                    }
                }
            }
        
       
        return count;
    }
}