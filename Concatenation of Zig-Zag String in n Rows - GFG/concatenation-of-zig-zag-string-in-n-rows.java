//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    int n=sc.nextInt();
                    Solution obj = new Solution();
                    System.out.println(obj.convert(s,n));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String convert(String s, int numRows)
    {
        //code here
        if(numRows == 1){
            return s;
        }

        StringBuilder[] sb = new StringBuilder[numRows];
        int row = 0;
        int dir = 0;

        for(int i=0; i<sb.length; i++){
            sb[i] = new StringBuilder();
        }

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            row += dir;
            sb[row].append(c);

            if(row==0 || row == numRows-1){
                dir = (dir==0) ? 1 : -dir;
            }
        }
        return convert(sb);
    }

    private String convert (StringBuilder[] sb){
        StringBuilder result = new StringBuilder();

        for(StringBuilder sbs : sb){
            result.append(sbs.toString());
        }
        return result.toString();
        
    }
}