// class Solution {
//     public int maxSubArray(int[] nums) {
//         int ms=Integer.MIN_VALUE;
//         int cs=0;
//         for(int i=0; i<nums.length; i++){
//             cs=cs+nums[i];
//             if(cs<0){
//                 cs=0;
//             }
//             ms=Math.max(cs,ms);
//         }
      
//         return ms;
//     }
    
// }
class Solution {
    public int maxSubArray(int[] nums) {
       int n =  nums.length;

       int max = Integer.MIN_VALUE;
       int sum = 0;

       for(int i=0; i<nums.length; i++){

           sum+=nums[i];
           max=Math.max(sum, max);

           if(sum<0){
               sum = 0;
           }
       }
       return max;
       }
}