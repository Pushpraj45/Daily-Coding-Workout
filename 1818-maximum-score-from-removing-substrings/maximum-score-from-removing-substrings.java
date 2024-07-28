class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st1 = new Stack<>();
        int ans = 0;

        if (x > y) {
            // Process 'ab' pairs first
            for (char ch : s.toCharArray()) {
                if (!st1.isEmpty() && st1.peek() == 'a' && ch == 'b') {
                    st1.pop();
                    ans += x;
                } else {
                    st1.push(ch);
                }
            }
            
            // Collect remaining characters back into s
            StringBuilder sb = new StringBuilder();
            while (!st1.isEmpty()) {
                sb.append(st1.pop());
            }
            s = sb.reverse().toString();

            // Process 'ba' pairs
            for (char ch : s.toCharArray()) {
                if (!st1.isEmpty() && st1.peek() == 'b' && ch == 'a') {
                    st1.pop();
                    ans += y;
                } else {
                    st1.push(ch);
                }
            }
        } else {
            // Process 'ba' pairs first
            for (char ch : s.toCharArray()) {
                if (!st1.isEmpty() && st1.peek() == 'b' && ch == 'a') {
                    st1.pop();
                    ans += y;
                } else {
                    st1.push(ch);
                }
            }
            
            // Collect remaining characters back into s
            StringBuilder sb = new StringBuilder();
            while (!st1.isEmpty()) {
                sb.append(st1.pop());
            }
            s = sb.reverse().toString();

            // Process 'ab' pairs
            for (char ch : s.toCharArray()) {
                if (!st1.isEmpty() && st1.peek() == 'a' && ch == 'b') {
                    st1.pop();
                    ans += x;
                } else {
                    st1.push(ch);
                }
            }
        }

        return ans;
    }
}
