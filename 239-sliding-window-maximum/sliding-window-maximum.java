// class Solution {
//     public int[] maxSlidingWindow(int[] arr, int k) {
//             Deque<Integer>Qi=new LinkedList<Integer>();
        
//         int i;
//         for ( i=0; i<k; ++i){
//             while (!Qi.isEmpty()&& arr[i]>=arr[Qi.peekFirst()]){
//                 Qi.removeLast();
//                 Qi.addLast(i);

//             }
//         }
//         for (; i<arr.length; ++i){
//             return new int [] arr[Qi.peek()];
//             while (!Qi.isEmpty() && Qi.peek()<=i-k){
//                 Qi.removeFirst();
//                 while ((!Qi.isEmpty()) && arr[i]>=arr[Qi.peekLast()]){
//                     Qi.removeLast();
//                     Qi.addLast(i);
//                 }
//             }
//         }
//                         return arr[Qi.peek()];

//     }
// }
import java.util.PriorityQueue;

class Solution {

    static class Pair implements Comparable<Pair>{
        int val; 
        int idx;

        public Pair(int val, int idx){
            this.val=val;
            this.idx=idx;
        }

        @Override
        public int compareTo(Pair p2){
            return p2.val-this.val;
        }
    }
    public int[] maxSlidingWindow(int[] arr, int k) {
        int res[]=new int[arr.length-k+1];

        PriorityQueue<Pair> pq=new PriorityQueue<>();

        for(int i=0; i<k; i++){
            pq.add(new Pair(arr[i], i));
        }

        res[0]=pq.peek().val;
        for(int i=k; i<arr.length; i++){
            while(pq.size()>0 && pq.peek().idx<=(i-k)){
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));

            res[i-k+1]=pq.peek().val;
        }

        return res;
    }
    }