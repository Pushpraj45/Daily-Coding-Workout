class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        return solve(s,"", ans);
    }

    private List<String> solve(String input, String output,List<String> ans){
        if(input.length()==0){
            ans.add(output);
            return ans;
        }

        String OP1 = output;
        String OP2 = output;

        if(Character.isLetter(input.charAt(0))){
            OP1+=Character.toLowerCase(input.charAt(0));
            OP2+=Character.toUpperCase(input.charAt(0)); // ek output mein lower and ek mein upper add kar diya 
            input = input.substring(1); // reducing for further process
            solve(input, OP1, ans);
            solve(input, OP2, ans);
        }
        else{
            OP1+=input.charAt(0);
            // OP2+=input.charAt(0); this can also be done as numeric digits doesn't have upper or lower case
            input = input.substring(1);
            solve(input,OP1, ans);
        }

        return ans;
    }
}