class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
         int n = A.length;
         int[] prefix = new int[n];

         int index = 0;
         HashSet<Integer> set1 = new HashSet<>();
         HashSet<Integer> set2 = new HashSet<>();

         if(A[0] == B[0]){
             prefix[index++] = 1;
            
         }
         else if(A[0]!=B[0]){
             prefix[index++] = 0;
              
         }
         set1.add(A[0]);
         set2.add(B[0]);

         for(int m = 1; m<n; m++){
             set1.add(A[m]);
             set2.add(B[m]);
             int counter = 0;

             for(int o:set1){
                 if(set2.contains(o))
                     counter++;
                 
             }
             prefix[index++] = counter;
             
         }
         return prefix;
        }
}