class Solution {
    
    private long m = 1_000_000_007;
    private Map<Integer, Long> memo = new HashMap<>();
    
    public int monkeyMove(int n) {
        // 2 ^ n combinations
        long all = helper(n);
        // Minus two cases without colision - all monkeys move in the clockwise direction or in the counter-clockwise direction
        return (int) ((all + m - 2) % m);
    }
    
    private long helper(int n) {
        if(n == 1) return 2;
        if(memo.containsKey(n)) return memo.get(n);
        long res = (helper(n / 2) * helper(n / 2) * (n % 2 == 1 ? 2 : 1)) % m;
        memo.put(n, res);
        return res;
    }
}