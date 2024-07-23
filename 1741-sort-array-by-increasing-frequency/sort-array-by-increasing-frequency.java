class pair{
    int freq,elem;
    pair(int freq,int elem){
        this.freq = freq;
        this.elem = elem;
    }
}
class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<pair> minheap = new PriorityQueue<>((a,b) -> (a.freq == b.freq ? b.elem - a.elem : a.freq - b.freq));
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            minheap.add(new pair(entry.getValue(),entry.getKey()));
        }
        int[] a = new int[n];
        int index = 0;
        while(minheap.size() > 0){
            int frequency = minheap.peek().freq;
            int element = minheap.peek().elem;

            for(int i=0;i<frequency;i++){
                a[index++] = element;
            }
            minheap.poll();
        }
        return a;
    }
}