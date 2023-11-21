class Solution {
    public String removeTrailingZeros(String num) {
        // return num.replaceAll("0+$","");

        int n = num.length()-1;
        while(n>0){
            if(num.charAt(n)!='0'){
                break;
            }
            else{
                n--;
            }
        }
        return num.substring(0,n+1); 
    }
}