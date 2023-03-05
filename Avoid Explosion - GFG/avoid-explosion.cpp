//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
  vector<int>parent;
  vector<int>size;
  void make(int source)
  {
      parent[source]=source;
      size[source]=1;
  }
  
  int find(int node)
  {
      if(node==parent[node])
      {
          return node;
      }
      
      parent[node]=find(parent[node]);
      
      return parent[node];
      
  }
  
  void combine(int a, int b)
  {
      a=find(a);
      b=find(b);
      
      if(a!=b)
      {
          if(size[a]>size[b])
          {
              parent[b]=a;
              size[a]+=size[b];
          }
          else
          {
              parent[a]=b;
              size[b]+=size[a];
          }
      }
  }
    vector<string> avoidExplosion(vector<vector<int>> mix, int n,
                                  vector<vector<int>> danger, int m) {
        
        parent=vector<int>(n+1);
        size=vector<int>(n+1);
        for(int i=1;i<=n;i++)
        {
            make(i);
        }
        
        vector<string>ans;
        
        for(int i=0;i<n; i++)
        {
            int u=mix[i][0];
            int v=mix[i][1];
            
            u=find(u);
            v=find(v);
            
            if(u==v)
            {
                ans.push_back("Yes");
                continue;
            }
            bool explode=false;
            for(int j=0;j<m; j++)
            {
                int x=danger[j][0];
                int y=danger[j][1];
                
                x=find(x);
                y=find(y);
                
                if(min(u,v)==min(x,y) and max(u,v)==max(x,y))
                {
                    explode=true;
                    break;
                }
            }
            
            if(explode)
            {
                ans.push_back("No");
            }
            else
            {
                ans.push_back("Yes");
                combine(u,v);
            }
            
            
        }
        
        return ans;
    }
};

//{ Driver Code Starts.

int main() {
    int tt;
    cin >> tt;
    Solution sol;
    while (tt--) {
        int n, m;
        cin >> n >> m;
        vector<vector<int>> mix(n, vector<int>(2));
        vector<vector<int>> danger(m, vector<int>(2));
        for (int i = 0; i < n; i++) {
            cin >> mix[i][0] >> mix[i][1];
        }

        for (int i = 0; i < m; i++) {
            cin >> danger[i][0] >> danger[i][1];
        }

        auto ans = sol.avoidExplosion(mix, n, danger, m);
        for (auto &val : ans) cout << val << " ";
        cout << "\n";
    }

    return 0;
}

// } Driver Code Ends