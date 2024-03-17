class Solution {
    public long countSubstrings(String s, char c) {
        long ans = 0;
        long count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        
        if(count==0){
            return 0;
        }
        
        ans =  count * (count+1)/2;
        return ans; 
        
//         long count = 0;
//         int cCount = 0;

//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == c) {
//                 cCount++;
//             }
//         }
        
//         if (cCount == 0) {
//             return 0;
//         }
        
//         count = cCount * (cCount + 1) / 2;
//         return count;
    }
}