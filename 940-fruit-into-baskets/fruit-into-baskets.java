class Solution {
    public int totalFruit(int[] arr) {
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
    }
}