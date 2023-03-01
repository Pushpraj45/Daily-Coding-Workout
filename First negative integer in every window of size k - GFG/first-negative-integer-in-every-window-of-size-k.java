//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long arr[], int n, int k)
    {
         int i = n-1 , j = n-1;
        long[] ans = new long[n-k+1];
        int len = ans.length-1;
        pair pr = new pair(0,j);

        while(j >= 0){
            if(arr[j] < 0){
                pr.val = arr[j];
                pr.key = j;
            }

            if(i-j+1 == k){
                ans[len] = pr.val;
                i--;
                j--;
                len--;
            }else{
                j--;
            }

            if(pr.key > i){
                pr.val = 0;
                pr.key = j;
            }
        }

        return ans;
    }
}
public class pair {
    public long val;
    public int key;

    public pair(long val, int key) {
        this.val = val;
        this.key = key;
    }
}
    