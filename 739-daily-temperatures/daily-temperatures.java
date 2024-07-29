class Pair {
    int temperature;
    int index;

    public Pair(int temperature, int index) {
        this.temperature = temperature;
        this.index = index;
    }
}
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> stack = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek().temperature <= temperatures[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans[i] = 0;
            } else {
                ans[i] = stack.peek().index - i; // this is the main part where change is happening
            }

            stack.push(new Pair(temperatures[i], i));
        }

        return ans;
    }
}
