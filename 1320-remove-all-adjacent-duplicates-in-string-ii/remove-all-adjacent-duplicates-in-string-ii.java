class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> chars = new Stack<>();
        Stack<Integer> count = new Stack<>();

        for(char c:s.toCharArray()){
            if(chars.size()>0 && chars.peek()==c){
                count.push(count.peek()+1);
            }
            else{
                count.push(1);
            }

            chars.push(c);

            if(count.peek()==k){
                for(int i=0; i<k; i++){
                    chars.pop();
                    count.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder("");
        while(chars.size()>0){
            sb.append(chars.pop());
        }

        return sb.reverse().toString();
    }
}