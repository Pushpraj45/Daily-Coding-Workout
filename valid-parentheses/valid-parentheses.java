class Solution {
    public boolean isValid(String str) {
         Stack<Character>s=new Stack<>();
        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);

            if (ch=='(' || ch=='{' || ch=='['){ //Opening parentheses we pushed in stack 
                s.push(ch);
            }

            else{
                if (s.isEmpty()){ // there is no parentheses 
                    return false;
                }
                if ((s.peek()=='(' && ch==')') //()
                || (s.peek()=='{' && ch=='}')  //{}
                || (s.peek()=='[' && ch==']')){ //[]
                    s.pop();
                }
                else {
                return false;
            }
            }
        }
        if (s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
        
    }
}