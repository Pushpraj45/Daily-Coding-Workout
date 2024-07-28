class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int index = 0;
        for(int val:pushed){
            st.push(val); // push till you get the same valeu in pop array 
            while(!st.isEmpty() && st.peek()==popped[index]){
                // pop the element 
                st.pop();
                index++; 
            }
        }
        return st.isEmpty();
    }
}