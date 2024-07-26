class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i: asteroids){
            if(i>0){
                st.push(i);
            }
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(i)){
                    st.pop();
                }
                if(st.isEmpty() || st.peek()<0){
                    st.push(i);
                }
                else if(i+st.peek()==0){
                    st.pop();
                }
            }
        }
            int[] res = new int[st.size()];
            for(int i=res.length-1; i>=0; i--){
                res[i] = st.pop();
            } 

            return res;
    }
}