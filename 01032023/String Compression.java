// class Solution {
//     public int compress(char[] chars) {
//         int i=0;
//         int ansIndex=0;
//         int n=chars.length;
//         while(i<n){
//             int j=i+1;
//             while(j<n && chars[i]==chars[j]){
//                 j++;
//             }
// //             whole traversing is done
// //             or founded a different character 
            
// //             old char ko store karlo 
//             chars[ansIndex++]=chars[i];
            
//             int count=j-i;
            
//             if(count>1){
//                 String cnt=count.toString();
//                 for(char ch: cnt){
//                     chars[ansIndex++]=ch;
//                 }
//             }
// //             Moving to different character 
//             i=j;
//         }
//         return ansIndex;
        
        
// String s="";
//  for(int i=0; i<chars.length; i++){
//             Integer count=1;
//             while(i<chars.length-1 && chars[i]==chars[i+1]){
//                 count++;
//                 i++;
//             }
//             s+=chars.toString();
//             if(count>1){
//                s+=count.toString();
//                 }
//             }
//         }
//         return s;
        

class Solution {
    public int compress(char[] chars) {
        
       StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);
        int count = 1;
        for(int i = 1; i< chars.length; i++){
            if(chars[i]==chars[i-1]){
                if(i == chars.length -1){
                    sb.append(++count);
                }
                else{
                    count++;
                }
            }
            else{
                if(count>1){
                    sb.append(count);
                    sb.append(chars[i]);
                }
                else{
                    sb.append(chars[i]);
                }
                count = 1;
            }
        }
        for(int i = 0; i<sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}

//     }
// }