
/*
BFS of Graph
Platform: GeeksforGeeks
Concept: Breadth First Search
Key Idea: Traverse nodes level by level using a queue.

Problem Link:
https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1

*/
import java.util.*;

class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[n];
        q.add(0);
        visited[0] = true;
        ans.add(0);
        while (!q.isEmpty()) {
            int t = q.poll();
            for (int k : adj.get(t)) {
                if (!visited[k]) {
                    q.add(k);
                    ans.add(k);
                    visited[k] = true;
                }
            }
        }
        return ans;

    }
}