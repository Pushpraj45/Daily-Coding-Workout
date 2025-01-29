class Solution{


public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] nodes = new int[n+1];
        Arrays.fill(nodes, -1);
        
        for(int[] edge:edges) {
            int u = find(nodes, edge[0]);
            int v = find(nodes, edge[1]);
            
            if(u == v) return edge;
            
            union(nodes, u, v);
        }
        
        return null;
    }

    private void union(int[] nodes, int x, int y) {
        nodes[x]=y;
    }
    
    private int find(int[] nodes, int x) {
        int parent = -1;
        
        while(x != -1) {
            parent = x;
            x = nodes[x];
        }
        
        return parent;
    }
    
    }