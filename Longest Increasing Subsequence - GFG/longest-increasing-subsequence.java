//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends




class Solution 
{
    public static int lcs(int arr1[], int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int dp[][]=new int[n+1][m+1];

//        initialize
        for (int i=0; i<n+1; i++){
            dp[i][0]=0;
        }

        for (int j=0; j<m+1; j++){
            dp[0][j]=0;
        }

//        bottom up
        for (int i=1; i<n+1; i++){
            for (int j=1; j<m+1; j++){
                if (arr1[i-1]==arr2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int arr1[])
    {

 HashSet<Integer> set=new HashSet<>();
        for (int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        int arr2[]=new int[set.size()];  // sorted unique elements
        int i=0;
        for (int num : set){
            arr2[i]=num;
            i++;
        }
        Arrays.sort(arr2);
        return lcs(arr1, arr2);
    }
} 