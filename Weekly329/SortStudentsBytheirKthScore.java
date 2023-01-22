class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
//         Using Comparators greedy Approach 
        Arrays.sort(score,(a,b)->b[k]-a[k]);
        return score;
    }
}