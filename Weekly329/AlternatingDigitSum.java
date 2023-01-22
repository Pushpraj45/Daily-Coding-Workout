class Solution {
    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        
        int sum = Character.getNumericValue(s.charAt(0));
        int temp = 1;
        
        for(int i=1; i<s.length(); i++){
            if(temp==1){
                sum-=Character.getNumericValue(s.charAt(i));
                temp=-1;
            }
            else{
                sum+=Character.getNumericValue(s.charAt(i));
                temp=1;
            }
        }
        return sum;
    }
}