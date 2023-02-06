//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSum(int nums[], int n) {
        // code here
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