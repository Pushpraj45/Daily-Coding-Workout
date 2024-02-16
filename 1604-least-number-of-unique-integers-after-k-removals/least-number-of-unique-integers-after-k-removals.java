class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
     HashMap<Integer, Integer> map = new HashMap<>();

     for(int n:arr){
         map.put(n,map.getOrDefault(n,0)+1);
     }   

     int[] freq = new int[map.size()];
     int i=0;
     for(int f:map.values()){
         freq[i++] = f;

     }

     Arrays.sort(freq);

     for(i=0; i<freq.length; i++){
         if(k<freq[i]){
             break;
         }
         else{
             k-=freq[i];
         }
     }

     return freq.length-i;
    }
}