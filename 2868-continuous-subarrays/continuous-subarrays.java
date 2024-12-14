class Solution {
    public long continuousSubarrays(int[] nums) {
        
        long ans = 0;
        int n = nums.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> pq1 = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        int i = 0; 

        for (int j = 0; j < n; j++) {

            pq.offer(new int[]{nums[j], j});
            pq1.offer(new int[]{nums[j], j});
            //get rid of stale el
            while (!pq.isEmpty() && pq.peek()[1] < i) {
                pq.poll();
            }
            while (!pq1.isEmpty() && pq1.peek()[1] < i) {
                pq1.poll();
            }

         
            while (!pq.isEmpty() && !pq1.isEmpty() && 
                   Math.abs(pq1.peek()[0] - pq.peek()[0]) > 2) {
                i++; 
                
                //as win slides again,keep geting rid of stale el
                while (!pq.isEmpty() && pq.peek()[1]< i) {
                    pq.poll();
                }
                while (!pq1.isEmpty() && pq1.peek()[1] < i) {
                    pq1.poll();
                }
            }

            ans += (j - i + 1);
        }

        return ans;
    }
}