//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int nums1[], int nums2[]) 
    {
        // Your Code Here
        int length=nums1.length+nums2.length;
        int[] merge=new int[length];
        int pos=0;

        for(int ele : nums1){
            merge[pos]=ele;
            pos++;
        }

        for(int ele : nums2){
            merge[pos]=ele;
            pos++;
        }
        // now we have a merged array we have to sort it 
        Arrays.sort(merge);
        // int si=0, ei=merge.length-1;
        // int n=merge.length;
        //  int mid=(si+ei)/2;
        //  double median=0.0;
        // if(n%2==0){
        //      median=(merge[mid]+merge[mid+1])/2;
        // }
        // else{
        //      median=merge[mid];
        // }
       

        // return median;
        double d=0;
        if(merge.length%2==0)
        {
        int mid=merge.length/2;
        int mid1=(merge.length/2)-1;
        d = (merge[mid]+merge[mid1])/2.0;
        }
        else if(merge.length%2!=0)
        {
        int mid=(merge.length-1)/2;
        d=merge[mid];
        }
        return d;
    }
}