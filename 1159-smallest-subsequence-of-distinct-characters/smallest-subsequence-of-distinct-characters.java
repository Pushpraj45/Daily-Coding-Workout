class Solution {
    public String smallestSubsequence(String s) {
        int[] count = new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        // Keep track of visited character so that we don't use them if present in answer
        boolean[] vis = new boolean[26];
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            count[c-'a']--;
            // if already there no need to go in next steps 
            if(vis[c-'a']){
                continue;
            }
            // traverse and check for larger characters if found and if not in last position remove from the stack as unke aur count hai aur hame lexico order mein chahiye hai na bhai 
            while(!st.isEmpty() && c<st.peek() && count[st.peek()-'a']>0){
                char ch = st.pop();
                vis[ch-'a'] = false;
            }

            st.push(c);
            vis[c - 'a'] = true; // again same process ko repeat karna hai ab bruh
        }
          StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        // st; [a,b,c] -> pop -> cba -> reverse -> abc
        return sb.reverse().toString();
        
    }
}