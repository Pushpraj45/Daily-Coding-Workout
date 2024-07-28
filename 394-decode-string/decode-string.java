class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = (k * 10) + (c - '0'); // Build the multiplier number
            } else if (c == '[') {
                numStack.push(k); // Push the current multiplier to numStack
                k = 0; // Reset multiplier
                stringStack.push(String.valueOf(c)); // Push '[' to stringStack
            } else if (c == ']') {
                // Build the substring inside the brackets
                StringBuilder temp = new StringBuilder();
                while (!stringStack.peek().equals("[")) {
                    temp.insert(0, stringStack.pop()); // Construct the string in reverse
                }
                stringStack.pop(); // Remove '['

                // Repeat the substring as per the multiplier
                StringBuilder replacement = new StringBuilder();
                int count = numStack.pop(); // Get the multiplier from numStack
                for (int i = 0; i < count; i++) {
                    replacement.append(temp); // Append substring 'count' times
                }

                stringStack.push(replacement.toString()); // Push the new string to the stack
            } else {
                // Push current character to stringStack
                stringStack.push(String.valueOf(c));
            }
        }

        // Build the final result from the stack
        StringBuilder result = new StringBuilder();
        while (!stringStack.isEmpty()) {
            result.insert(0, stringStack.pop()); // Construct the final string
        }
        return result.toString();
    }
        
}