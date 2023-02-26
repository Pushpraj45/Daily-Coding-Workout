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
    public static boolean valid(int arr[], int n,int s, int max){
  int students=1;
  int sum=0;
  for (int i = 0; i < n; ++i)
  {
    sum=arr[i]+sum;
    if (sum>max)
    {
      students++;
      sum=arr[i];
    }
  }

  if (students>s)
  {
    return false;
  }
  else
    return true;
}
    //Function to find minimum number of pages.
    public static int findPages(int[]arr,int n,int s)
    {
        //Your code here
        
        
         int result=-1;

  // if books is less than students
  if(n<s){
    return -1;
  }

  int sum=0;
  for (int i = 0; i <n ; ++i)
  {
    sum=sum+arr[i];
  }

  //set l as max in arr
  int l=Integer.MIN_VALUE;
  for(int i=0; i<n; i++)
{
    l=Math.max(arr[i],  l);
} 
int h=sum;
  int res=-1;

  while(l<=h){
    int mid=l+((h-l)/2);

    // check if mid is maximum pages a student can read
    if(valid(arr,n,s,mid)==true){
      // if true then set result as mid and check if there exists a lower value(pages)
      result=mid;
      h=mid-1; 
    }
    else {
      l=mid+1;
    }
  }
  return result;
        
        
    }
};