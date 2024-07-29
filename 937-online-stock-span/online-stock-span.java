class StockSpanner {
    Stack<Pair> st;
    int count;

    public StockSpanner() {
        st = new Stack<>();
        count = 1;
    }
    
    public int next(int price) {
        int ans = 1;
        while (!st.isEmpty() && st.peek().getKey() <= price) {
            st.pop();
        }

        if (!st.isEmpty()) {
            ans = count - st.peek().getValue();
        } else {
            ans = count;
        }

        st.push(new Pair(price, count++));
        return ans;
    }}
class Pair {
    int key;
    int value;

    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */