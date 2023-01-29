//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.splitArray(arr,N,K));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int splitArray(int[] nums , int N, int k) {
        // code here
         int start=0;
        int end=0;
        for(int i=0; i<nums.length; i++){
            start=Math.max(start, nums[i]);
            end+=nums[i];
        }
        // binary Search 
        while(start<end){
            // try for the middle as the middle ans 
            int mid=start+(end-start)/2;
            int sum = 0;
            int pieces = 1;
            for(int num: nums){
                if(sum+num > mid){
                    // you can not add this in the subarray , make new one 
                    // suppose we added this in subarray , then sum = num
                    sum=num;
                    pieces++;
                

                }
                else{
                    sum+=num;
                }
            }
            if(pieces>k){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return end ; // or start both are equa
    }
};