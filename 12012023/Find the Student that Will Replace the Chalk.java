class Solution {
    public int chalkReplacer(int[] chalk, int k) {
         long sum=0;
        for(int i=0; i<chalk.length; i++){
            sum+=chalk[i];
        }

        sum=(int)(k%sum);

        int ans=0;
        for(int i=0;i<chalk.length;i++){

            if(sum<chalk[i]){
                ans=i;
                break;
            }
            
            sum-=chalk[i];
        }
        return ans;
        
    }
}