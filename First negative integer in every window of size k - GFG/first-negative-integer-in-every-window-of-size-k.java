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
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        ArrayList<Long> arr = new ArrayList<>();
        
        int i=0,j = 0;
        Queue<Long> que = new LinkedList<>();
        
        while(j<N){
            if(A[j]<0){
                que.add(A[j]);
            }
            if(j-i+1<K){
                j++;
            }
            else if(j-i+1==K){
                if(que.isEmpty()){
                    arr.add(0L);
                }
                else {
                    arr.add(que.peek());
                    if(A[i] == que.peek()){
                        que.remove();
                    }
                  
                }
                  i++;
                    j++;
            }
        }
        
        long[] ans = new long[N-K+1];
        for(int l=0; l<arr.size(); l++){
            ans[l] = arr.get(l);
        }
        return ans; 
    }
}