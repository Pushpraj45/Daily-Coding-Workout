class Solution {
    public int numSubarraysWithSum(int[] arr, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
//        (sum, count)
        
        map.put(0,1);
        int sum=0; 
        int ans=0;
        
        for (int j=0; j<arr.length; j++){
            sum+=arr[j];  // sum(j)
            if (map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }
        return ans;
    }
}