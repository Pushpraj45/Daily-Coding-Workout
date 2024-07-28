class Solution {
    public boolean isValid(String S) {
        Stack<Character> stack = new Stack<>();
        for(char curr: S.toCharArray()) {
            if(curr == 'a'){
                stack.push('c');
                stack.push('b');
            }else if(stack.isEmpty() || stack.pop() != curr) return false;
        }
        return stack.isEmpty();
    }
}