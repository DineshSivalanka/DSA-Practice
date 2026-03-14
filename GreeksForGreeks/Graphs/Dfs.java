
/*
DFS of Graph
Platform: GeeksforGeeks
Concept: Depth First Search
Key Idea: Traverse a graph by exploring nodes as deep as possible before backtracking (using recursion or stack).

Problem Link:
https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
 */
import java.util.*;

class Solution {
    public static void Dfs(ArrayList<Integer> ans, boolean[] visited, ArrayList<ArrayList<Integer>> adj, int start) {
        visited[start] = true;
        ans.add(start);
        for (int k : adj.get(start)) {
            if (!visited[k]) {
                Dfs(ans, visited, adj, k);
            }
        }

    }

    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = adj.size();
        boolean[] visited = new boolean[n];
        // code here
        int start = 0;
        Dfs(ans, visited, adj, start);
        return ans;

    }
}