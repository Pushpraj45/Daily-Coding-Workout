class Solution {
    public int totalFruit(int[] tree) {
        /* Typical Sliding window as the size of bucket is 2 only 
        int n = arr.length;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        while(end<n){
            map.put(arr[end], map.getOrDefault(arr[end],0)+1);
            while(map.size()>2){
                map.put(arr[start], map.get(arr[start])-1);
                if(map.get(arr[start])==0){
                    map.remove(arr[start]);
                }
                    start++;

            }
            ans = Math.max(ans, end-start+1);
            end++;

        }

        return ans; 
        */

        int lastfruit = -1;
        int secondlastfruit = -1;
        int lastfruitcnt = 0;
        int currmax = 0;
        int max = 0;

        for(int fruit:tree){
            if(fruit==lastfruit || fruit == secondlastfruit){
                currmax+=1;
            }
            else {
                currmax = lastfruitcnt+1;
            }

            if(fruit == lastfruit){
                lastfruitcnt+=1;
            }
            else{
                lastfruitcnt = 1;
            }

            if(fruit!=lastfruit){
                secondlastfruit = lastfruit;
                lastfruit = fruit;
            }
            max = Math.max(max,currmax);
        }

        return max;
    }
}