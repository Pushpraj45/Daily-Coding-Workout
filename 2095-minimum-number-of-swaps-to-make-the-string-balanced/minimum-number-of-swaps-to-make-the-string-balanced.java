class Solution {
    public int minSwaps(String s) {
        int count = 0;
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && st.peek()=='[' && c==']'){
                st.pop();
            }
            else if(c=='['){
                st.push(c);
            }
        }

        return (st.size()+1)/2;
    }
}