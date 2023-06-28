class Solution {
    public int maximum69Number (int num) {
      
     //  String s = num.toString(); // As strings are immutable so we directly cannot modify them 
    //    Finding first 6 in num ans then replacing it by 9 itself 
    String s = String.valueOf(num);
    char[] chars = s.toCharArray();

       for(int i=0; i<chars.length; i++){
           if(chars[i]=='6'){
               chars[i]='9';
               break;
           }
       }
       int ans = Integer.parseInt(new String(chars));
       return ans;
        
    }
}