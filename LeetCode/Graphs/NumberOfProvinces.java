/*
Number of Provinces
Platform: LeetCode
Concept: Connected Components in Graph
Key Idea: Treat the adjacency matrix as a graph and 
        count the number of connected components using DFS/BFS.

        
Problem link:
https://leetcode.com/problems/number-of-provinces/

 */

class Solution {
    public static void dfs(int[][] isConnected, boolean visited[], int city) {
        visited[city] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[city][j] == 1 && !visited[j]) {
                dfs(isConnected, visited, j);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, i);
                count++;
            }
        }
        return count;

    }
}