
class Solution{
public int[] kthSmallestPrimeFraction(int[] A, int K) {
    int n = A.length;
    
    PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
        public int compare(int[] a, int[] b) {
            return Integer.compare(A[a[0]] * A[n - 1 - b[1]], A[n - 1 - a[1]] * A[b[0]]);
        }
    });
    
    for (int i = 0; i < n; i++) {
        pq.offer(new int[] {i, 0});
    }
    
    while (--K > 0) {
        int[] p = pq.poll();
        
        if (++p[1] < n) {
            pq.offer(p);
        }
    }
    
    return new int[] {A[pq.peek()[0]], A[n - 1 - pq.peek()[1]]};
}
}