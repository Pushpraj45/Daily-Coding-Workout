
import java.util.*;
class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
                HashSet<Integer> set=new HashSet<>();
                ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                list.add(arr2[i]);
                set.remove(arr2[i]);
            }
          

        }
        int res[]=new int[list.size()];
    int index = 0;
    for (int i : list){
      res[index++] = i;
      }
      return res;
    }
}