class Solution {
    public boolean isFascinating(int n) {
       String str=Integer.toString(n) + Integer.toString(2*n)+Integer.toString(3*n);
       if(str.length()!=9){
           return false;
       }
       for(char digit='1'; digit<='9'; digit++){
           if(str.indexOf(digit)==-1){
               return false;
           }

       }
       return true;
    }
}