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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution { 
  
     static int isHappy(int n) { 
         //code here
         Set <Integer> myset=new HashSet<>();

        while(n!=1){
            int curr = n;
            int sum = 0;

            while(curr!=0){
                int rem=curr%10;
                sum = sum + (rem*rem);
                curr=curr/10;
            }
            if(myset.contains(sum)){
                return 0;
            }

            n=sum;
            myset.add(n);
        }
        return 1;
     }
}