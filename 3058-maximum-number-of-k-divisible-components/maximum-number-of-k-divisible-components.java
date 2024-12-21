import java.util.*;

class Solution {
    int componentCount = 0;

    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        // Create an adjacency list for the graph
        List<Integer>[] adjList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];
            adjList[node1].add(node2);
            adjList[node2].add(node1);
        }

        // Start DFS traversal from node 0
        boolean[] visited = new boolean[n];
        dfs(0, -1, adjList, values, k, visited);

        // Return the total number of components
        return componentCount;
    }

    private int dfs(int current, int parent, List<Integer>[] adjList, int[] values, int k, boolean[] visited) {
        visited[current] = true;
        // Initialize the sum of the current subtree with the value of the current node
        int subtreeSum = values[current];

        // Traverse all neighbors (children)
        for (int neighbor : adjList[current]) {
            if (neighbor != parent && !visited[neighbor]) { // Avoid revisiting the parent node
                // Recursively calculate the subtree sum for the child node
                subtreeSum += dfs(neighbor, current, adjList, values, k, visited);
            }
        }

        subtreeSum = subtreeSum % k;

        // Check if the subtree sum is divisible by k
        if (subtreeSum == 0) {
            componentCount++; // Increment the component count
            return 0; // Reset the sum for this subtree as it forms a valid component
        }

        // Return the subtree sum to the parent
        return subtreeSum;
    }
}