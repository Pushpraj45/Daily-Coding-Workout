class Solution {
    public String smallestNumber(String pattern) {
        // Jab i hoto direct add kar do ans mein sab kuch otherwise keep building the things 
        StringBuilder ans = new StringBuilder("");
        int number = 1;
        Stack<Integer> st = new Stack<>();
        st.push(1);

        for(int i=0; i<pattern.length(); i++){
            if(pattern.charAt(i)=='I'){
                while(st.size()!=0){
                    ans.append(st.pop());
                }

                number+=1;
                st.push(number);
            }
            else{
                number+=1;
                st.push(number);
            }
        }

        while(st.size()!=0){
            ans.append(st.pop());
        }

        return ans.toString();
    }
}

/*
i = 7, pattern[7] = 'D'
Increment num: num = 9
Push num: st = [6, 7, 8, 9]
Final pop from stack:

Pop all from stack: ans = "123549876"
*/