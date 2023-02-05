//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String s) {
        // code here
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        if(s.length()==1){
            return 1;
        }
        for(int i=0; i<s.length()/2; i++){
            int n=s.length();
            if(s.charAt(i)!=s.charAt(n-1-i)){
//                 Not a palindrome 
                return 0;
            }
        }
        return 1;
    }
};