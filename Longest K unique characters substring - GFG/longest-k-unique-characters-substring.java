//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
         HashMap<Character,Integer> hm=new HashMap<>();
        int i =0;
        int j =0;
        int maxStringlen=-1;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(hm.containsKey(ch)){
                int freq=hm.get(ch);
                freq++;
                hm.put(ch,freq);
            }
            else{
                hm.put(ch,1);
            }
            
            if(hm.size()<k){
                j++;
            }
            else if(hm.size()==k){
                maxStringlen=Math.max(maxStringlen,j-i+1);
               j++;
            }
            else if(hm.size()>k ){
                while(hm.size()>k && i<s.length()){
                
                if(hm.containsKey(s.charAt(i))){
                    int freq=hm.get(s.charAt(i));
                    freq--;
                    hm.put(s.charAt(i),freq);
                }
                 if(hm.get(s.charAt(i))==0){
                    hm.remove(s.charAt(i));
                }
                
                i++;
                
            }
            j++;
            }
            
            
        }
        return maxStringlen;
    }
}