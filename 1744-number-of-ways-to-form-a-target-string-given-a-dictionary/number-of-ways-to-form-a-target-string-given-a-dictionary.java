class Solution {
    private int n;
    private int l;
    private int m;
    private String t;
    private static Long[][] dp;
    private static int[][] cnt;
    private int MOD = (int)1e9 + 7;


    public long dfs(int i,int k)
    {   
        // if our target string get exhausted then we managed to form a string
        if(k == m)
          return 1;
     //if our word gets exhausted first it means it is not possible
        if(i == l)
          return 0;
     
//already cached return the respective value
        if(dp[i][k] != null)
        {
            return dp[i][k];
        }  
  
//here we have two choices ,either to include the current character or
//not include

//if not included , we simply move forward to the next charcter
        dp[i][k] = dfs(i + 1,k);
 
        int c = t.charAt(k);
 //cnt[i][c-'a'] != 0 represents there is an option to take this 
//character,we multiply it with cnt[i][c-'a'] 
//inorder not to duplicate work for the same character with the same parameters among multiple words. 
        if(cnt[i][c - 'a'] != 0)
        { 
       
          dp[i][k] +=  (cnt[i][c - 'a']) * dfs(i + 1,k + 1);
          dp[i][k] %= MOD;
        }

         return dp[i][k];
        
    }
    public int numWays(String[] words, String target) {
         
          t = target;
          n = words.length;
          l = words[0].length();
          m = target.length();
          dp = new Long[l][m];
          
       //cnt is used to store the occurence of a character at that particular index among all words
          cnt = new int[l][26];

          for(int i = 0;i < l;i++)
          {
              for(int j = 0;j < n;j++)
              {
                  cnt[i][words[j].charAt(i) - 'a'] += 1;
              }
          }


          return (int)dfs(0,0);
    }
}