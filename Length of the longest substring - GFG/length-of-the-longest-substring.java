//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String s){
         
        HashSet<Character> hm = new HashSet<>();
        int i=0;
        int j=0;
        int maxL = -1;
        while(j<s.length()){
            if(!hm.contains(s.charAt(j))){
                hm.add(s.charAt(j));
                maxL = (j-i+1) > maxL ? (j-i+1) : maxL;
                j++;
            }
            else{
                while(s.charAt(i) != s.charAt(j)){
                    hm.remove(s.charAt(i));
                    i++;
                }
                hm.remove(s.charAt(i));
                i++;
            }
        }
        return maxL;
    }
}