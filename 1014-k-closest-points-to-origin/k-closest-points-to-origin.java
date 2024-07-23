class Triplet{
    int distance,x,y;
    Triplet(int distance,int x,int y){
        this.distance = distance;
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplet> maxheap = new PriorityQueue<>((a,b) -> b.distance - a.distance);
        for(int[] temp : points){
            int dist = temp[0]*temp[0] + temp[1]*temp[1];
            maxheap.add(new Triplet(dist,temp[0],temp[1]));
            if(maxheap.size() > k){
                maxheap.poll();
            }
        }
        int[][] a = new int[k][points[0].length];
        int index = 0;
        while(!maxheap.isEmpty()){
            int xcoordinate = maxheap.peek().x;
            int ycoordinate = maxheap.peek().y;
            a[index][0] = xcoordinate;
            a[index][1] = ycoordinate;
            index++;
            maxheap.poll();
        }
        return a;
    }
}