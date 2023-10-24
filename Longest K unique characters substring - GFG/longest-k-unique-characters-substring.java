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
        int n = s.length();
        int ans = -1, i=0, j=0;
        
        HashMap<Character, Integer> hm = new HashMap<>(); // Map to store the frequency character
        
        while(j<n){
            // Calculation based on conditions given 
            char ch  = s.charAt(j);
            // Get the frequency of ch from Map and increase it 
            hm.put(ch, hm.getOrDefault(ch,0)+1);
            
            if(hm.size()<k){
                j++;
            }
            
            else if(hm.size()==k){
                ans = Math.max(ans, j-i+1);
                j++;
            }
            else if(hm.size()>k){
                while(hm.size()>k){
                    if(hm.containsKey(s.charAt(i))){
                        int f = hm.get(s.charAt(i));
                        f--;
                        hm.put(s.charAt(i), f);
                    }
                    if(hm.get(s.charAt(i))==0){
                        hm.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return ans; 
         
    }
}