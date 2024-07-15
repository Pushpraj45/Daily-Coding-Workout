class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i=0;
        int j=0;
        int n=blocks.length();
        int count=0;
        int min=Integer.MAX_VALUE;
        char c[]=blocks.toCharArray();
        while(j<n){
           if(c[j]=='W'){
              count++;
            }  
           if(j-i+1==k){
              min=Math.min(min,count);
                if(c[i]=='W'){
                    count--;
                }
                i++;


            }
                j++;
         }
      return min;
    }
}