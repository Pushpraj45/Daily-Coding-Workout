class Solution {
public List<Boolean> checkIfPrerequisite(int n, int[][] pre, int[][] q) {
    List<Boolean> res=new ArrayList<>();
    boolean adj[][]=new boolean[n][n];
    for(int i[]:pre)
    {
        adj[i[0]][i[1]]=true;
    }
    for (int k = 0; k < n; k++) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = adj[i][j] | (adj[i][k] & adj[k][j]);
            }
        }
    }
    for(int i[]:q)
     res.add(adj[i[0]][i[1]]);
    return res;

    
}
}