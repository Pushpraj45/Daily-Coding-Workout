class Solution {
    public int fc(int[] row1)
    {
        int start=0;
        int end=row1.length-1;
        int ans=-1;

        while(start<=end)
        {
            int mid=(start+end)/2;

            if(row1[mid]==1)
            {
                ans=mid;
                end=mid-1;

            }
            else if(row1[mid]<1)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }

        return ans;

    }

    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] returning_array={0,0};
        int index=0;
        for(int[] row1 : mat)
        {
            Arrays.sort(row1);

           int first_occurrence=fc(row1);
           if(first_occurrence==-1)
           {
               first_occurrence=0;
           }
           else
           {
               //Total ones would be all after first occurrence
               first_occurrence=row1.length-first_occurrence;
           }

           if( first_occurrence > returning_array[1])
           {
               returning_array[1]=first_occurrence;
               returning_array[0]=index;

           }
           index++;

        }
        return returning_array;
        
    }
}