// class Solution {
//     public String removeOuterParentheses(String s) {
//         String ans="";
//         int mycount = 0;
//         for(int i=0; i<s.length(); i++){
//             if(s.charAt(i)=='(' && mycount==0){
//                 mycount++;
//             }
//             else if(s.charAt(i)=='(' && mycount>=1) // Another opening parenthese is encountered so adding it in ans
//             {
//                 ans+=s.charAt(i); 
//                 mycount++;
//             }
//             else if(s.charAt(i)==')' && mycount>1){
//                 ans+=s.charAt(i); // As one closing parenthese is encountered adding it and mycount decrement
//                 mycount--;
//             }
//             else if(s.charAt(i)==')' && mycount==1){
//                 mycount--;
//             }

//         }
//             return ans;

//     }
// }

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (cnt > 0) {
                    sb.append(c);
                }
                cnt++;
            } else if (c == ')') {
                cnt--;
                if (cnt > 0) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}