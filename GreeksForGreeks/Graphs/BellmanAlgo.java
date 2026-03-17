/*
Bellman-Ford Algorithm(GeeksforGeek)
Concept: Shortest Path
Key Idea: Works with negative weights and detects negative cycles

Probltm Link:
https://www.geeksforgeeks.org/problems/distance-from-the-source-bellman-ford-algorithm/0
*/

// User function Template for Java
import java.util.*;

class Solution {
    public int[] bellmanFord(int V, int[][] edges, int src) {
        // code here
        int dist[] = new int[V];
        Arrays.fill(dist, 100000000);
        dist[src] = 0;
        // ArrayList<ArrayList,int[]>> adj=new ArrayList<>();
        for (int i = 0; i < V; i++) {
            for (int edge[] : edges) {
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];
                // adj.get(u).add(new int[]{v,w});
                if (dist[u] != 100000000 && dist[u] + w < dist[v]) {
                    if (i == V - 1)
                        return new int[] { -1 };
                    dist[v] = dist[u] + w;
                }
            }
        }
        return dist;
    }
}
