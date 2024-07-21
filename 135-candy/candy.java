class Solution {
    public int candy(int[] ratings) {
         int n=ratings.length;
        int[] left=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++)
          {
            left[i]=1;
            if(ratings[i-1]<ratings[i])
              left[i]+=left[i-1];
          }
          int right=1,cur=0, sum=Math.max(left[n-1],1);
          for(int i=n-2;i>=0;i--)
            {
                if(ratings[i]>ratings[i+1])
                    cur=right+1;
                 else
                   cur=1;
                 right=cur;
                 sum+=Math.max(cur, left[i]);     
                 
            }
            return sum;
    }
}