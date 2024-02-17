class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
    //    if (heights.length == 0) {
    //         return 0;
    //     }
        
    //     for (int i = 0; i < heights.length - 1; i++) {
    //         int diff = heights[i + 1] - heights[i];
    //         if (diff > 0) {
    //             if (ladders > 0) {
    //                 ladders--;
    //             } else {
    //                 bricks -= diff;
    //             }
    //             if (bricks < 0) {
    //                 return i;
    //             }
    //         }
    //     }
        
    //     return heights.length - 1;

    PriorityQueue<Integer> p =new PriorityQueue<>((a,b) -> b-a);
    int index = 0;
    int difference = 0;
    for( index=0; index<heights.length-1; index++){
        difference = heights[index+1]-heights[index];

        if(difference<=0){
            continue;
        }

        bricks-=difference;
        p.add(difference);

        if(bricks<0){
            bricks+=p.remove();
            ladders--;
        }

        if(ladders<0){
            break;
        }
    }
        return index;

    
    }
}