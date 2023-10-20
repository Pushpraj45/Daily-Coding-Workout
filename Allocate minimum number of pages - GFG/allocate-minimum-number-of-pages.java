//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        
        int res = -1;
        if(N<M){
            return -1;
        }
        int end = 0;
        int start = Integer.MIN_VALUE;
        
        for(int i=0; i<A.length; i++){
            start = Math.max(start, A[i]);
            
            end = end+A[i];
        }
        
        while(start<=end){
            int mid = start+(end-start)/2;
            if(isValid(A, N,M, mid)==true){
                res = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return res;
        
    }
    public static boolean isValid(int[] arr, int n, int k, int max){
        int student = 1;
        int sum = 0;
        
        for(int i=0; i<n; i++){
            sum+=arr[i];
            if(sum>max){
                student++;
                sum = arr[i]; // Sum max se bada ho jayega isliye new student bana diya aur sum ko arr[i] se intialize kar diya 
            }
        }
        if(student>k){
            return false;
        }
        return true;
    }
    
};