//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String str1,String str2)
    {
        
        // Your code here
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        
        if(str1.length()==str2.length()){
            char[] str1charArray=str1.toCharArray();
            char[] str2charArray=str2.toCharArray();
            
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            
            boolean result=Arrays.equals(str1charArray, str2charArray);
            if(result){
                return true;
            }
         
        }
        return false;
        
    }
}