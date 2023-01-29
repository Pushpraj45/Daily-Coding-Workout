//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int nums[], int n)
    {
        if(nums.length==0 || nums==null){
           return 0;
       }
       int dp[] = new int[nums.length+1];
       dp[0]=0;
       dp[1]=nums[0];
       for(int i=2; i<=nums.length; i++){
           dp[i]=Math.max(dp[i-1], nums[i-1]+dp[i-2]);
       }
       return dp[nums.length];
    }
}