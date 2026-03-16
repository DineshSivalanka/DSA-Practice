import java.util.*;
/*
Problem Solved
• Undirected Graph Cycle Detection – GeeksforGeeks
Key Idea
While traversing a graph, if we visit an already visited node that is not the parent of the current node, then a cycle exists.

Problem Link:
https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/0
*/

class Solution {
    public boolean bfs(boolean visited[], ArrayList<ArrayList<Integer>> adj, int start) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { start, -1 });
        visited[start] = true;
        while (!q.isEmpty()) {
            int cell[] = q.poll();
            int node = cell[0], parent = cell[1];
            for (int neighbour : adj.get(node)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(new int[] { neighbour, node });
                } else if (neighbour != parent) {
                    return true;
                }
            }

        }
        return false;
    }

    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (bfs(visited, adj, i)) {
                    return true;
                }
            }
        }
        return false;
    }
}