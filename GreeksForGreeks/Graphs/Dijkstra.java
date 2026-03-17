
/*
Dijkstra Algorithm(GeeksforGeek)
Concept: Shortest Path (Greedy + Priority Queue)
Key Idea: Find shortest distance from source to all nodes

Problem Link:
https://www.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/0
*/
import java.util.*;

class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int edge[] : edges) {
            int source = edge[0];
            int dest = edge[1];
            int w = edge[2];
            adj.get(source).add(new int[] { dest, w });
            adj.get(dest).add(new int[] { source, w });
        }
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        dist[src] = 0;
        pq.add(new int[] { src, 0 });
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int node = cur[0];
            int d = cur[1];
            if (d > dist[node])
                continue;
            for (int[] neighbor : adj.get(node)) {
                int next = neighbor[0];
                int weight = neighbor[1];
                if (dist[node] + weight < dist[next]) {
                    dist[next] = dist[node] + weight;
                    pq.add(new int[] { next, dist[next] });
                }
            }
        }
        return dist;
    }
}