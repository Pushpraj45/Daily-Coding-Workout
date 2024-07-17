import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int balancedString(String s) {
        int n = s.length();
        int myt = n/4;
        int left = 0;
        int min = n;
        int right = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        for(char c:s.toCharArray()){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }

        if(balance(hm, myt)){
            return 0;
        }

        while(right<n){
            char ch = s.charAt(right);
            hm.put(ch, hm.get(ch)-1);
            // if(hm.get(ch)==0){
            //     hm.remove(ch);
            // }

            while(balance(hm, myt)){
                min = Math.min(min, right-left+1);
                hm.put(s.charAt(left), hm.get(s.charAt(left))+1);

                left++;
            }

            right++;
        }

        return min;
    }

    public boolean balance(Map<Character, Integer> count, int target){
            return count.getOrDefault('Q', 0) <= target &&
               count.getOrDefault('W', 0) <= target &&
               count.getOrDefault('E', 0) <= target &&
               count.getOrDefault('R', 0) <= target;
    }

 
}
