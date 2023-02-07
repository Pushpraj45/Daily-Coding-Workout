//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            int arr[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
             arr[i] = Integer.parseInt(s[i]);
             
            out.println(new Solution().maxLength(arr, n)); 
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    /* Function to return the length of the
       longest subarray with ppositive product */
    int maxLength(int arr[], int n) { 
        //code here
        int a=0, b=-1, c=0;
        int res=0;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                a=i+1;
                b=-1;
                c=0;
                continue;
            }
            else if(arr[i]<0){
                c++;
                if(b==-1){
                    b=i;
                }
            }
            if(c%2==0){
                res=Math.max(res, i-a+1);
            }
            else{
                res=Math.max(res, i-b);
            }
        }
        return res;
    }
   
}