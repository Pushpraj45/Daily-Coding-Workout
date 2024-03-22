// class Solution {
//     public List<String> generateParenthesis(int n) {
//         int open = n;
//         int close = n; 

//         List<String> ans =new ArrayList<>();
//         String op = "";
//         helper(open,close,op,ans);
//         return ans;
//     }

//     public void helper(int open, int close, String op, List<String> ans){
//         if(open== 0 && close==0 ){
//             ans.add(op);
//             return;
//         }

//         if(close>open) {// open and close both can be chosen in this case
//         String op1 = op;
//         String op2 = op;
//         if(open>0){
//             op1+="(";
//             helper(open-1,close,op1,ans);
//         }
//         else{
//             op2+=")";
//             helper(open,close-1,op2,ans);
//         }

        
//     }
//     else{
//         // only choice is there of open bracket
//         op+="(";
//         helper(open-1, close, op, ans);
//     }
// }
// }

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n, n, "", ans);
        return ans;
    }

    public void helper(int open, int close, String op, List<String> ans) {
        if (open == 0 && close == 0) {
            ans.add(op);
            return;
        }

        if (open > 0) {
            // Add an open parenthesis if there are remaining openings
            helper(open - 1, close, op + "(", ans);
        }

        if (close > open) {
            // Add a closing parenthesis if there are remaining closings and the count of closing parentheses is greater than openings
            helper(open, close - 1, op + ")", ans);
        }
    }
}
