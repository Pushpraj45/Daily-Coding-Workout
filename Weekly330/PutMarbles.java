class Solution {
    public long putMarbles(int[] weights, int k) {
        List<Integer> sums = new ArrayList<>();
        
        for (int i = 1; i < weights.length; ++i) {
            sums.add(weights[i] + weights[i - 1]);
        }
        
        Collections.sort(sums);
        
        long smaller = 0;
        
        for (int i = 0; i < k - 1; ++i) {
            smaller += sums.get(i);
        }
        
        long larger = 0;
        
        Collections.reverse(sums);
        
        for (int i = 0; i < k - 1; ++i) {
            larger += sums.get(i);
        }
        
        return larger - smaller;
    }
}