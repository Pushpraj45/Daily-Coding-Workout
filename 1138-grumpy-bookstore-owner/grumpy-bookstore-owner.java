class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int k) {
        int ans=0, sum  = 0, i=0, j=0;

        while(j<customers.length){
            if(grumpy[j]==1){
                sum+=customers[j];
            }
           if(j-i+1!=k){
                j++;
            }

            else if(j-i+1==k){
                ans = Math.max(ans, sum);
                if(grumpy[i]==1){
                sum-=customers[i];

                }
                i++;
            j++;
            }
        }

        for(int it=0; it<grumpy.length; it++){
            if(grumpy[it]==0){
                ans+=customers[it];
            }
        }

        return ans;
    }
}