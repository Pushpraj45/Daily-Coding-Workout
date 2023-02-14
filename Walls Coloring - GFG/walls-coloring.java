//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine().trim());
			int [][] colors = new int[N][3];
			for(int i = 0; i < N; i++) {
				String [] str = br.readLine().trim().split(" ");
				colors[i][0] = Integer.parseInt(str[0]);
				colors[i][1] = Integer.parseInt(str[1]);
				colors[i][2] = Integer.parseInt(str[2]);
			}
			Solution obj = new Solution();
			out.println(obj.minCost(colors, N));
		}
		out.close();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
	int minCost(int [][] colors, int N){
        //Write your code here
        int p=0,b=0,y=0;
        for(int i=0; i<N; i++){
            
            int P=Math.min(b,y)+colors[i][0];
            int B=Math.min(p,y)+colors[i][1];
            int Y = Math.min(p,b)+colors[i][2];
            
            p=P;
            b=B;
            y=Y;
        }
        return Math.min(p, Math.min(b,y));
    }
}