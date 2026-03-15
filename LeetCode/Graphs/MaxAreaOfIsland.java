/*
Max Area of Island (Problem 695)
Concept: DFS on Grid
Approach: Traverse connected land cells and calculate the island area

Problem Link:
https://leetcode.com/problems/max-area-of-island/
 */

class Solution {
    public static int dfs(int[][] grid, int i, int j, int m, int n) {
        if (i < 0 || j < 0 || i + 1 > m || j + 1 > n || grid[i][j] == 0)
            return 0;
        grid[i][j] = 0;
        int area = 1;
        area += dfs(grid, i, j - 1, m, n);
        area += dfs(grid, i, j + 1, m, n);
        area += dfs(grid, i - 1, j, m, n);
        area += dfs(grid, i + 1, j, m, n);
        return area;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length, n = grid[0].length, maxlen = 0;
        // boolean visited[][]=new boolean[m][n];
        if (grid == null || n == 0)
            return 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int area = dfs(grid, i, j, m, n);
                    maxlen = Math.max(area, maxlen);
                }
            }
        }
        return maxlen;

    }
}