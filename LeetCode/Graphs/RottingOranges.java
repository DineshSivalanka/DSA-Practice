
/*
Rotting Oranges (Problem 994)
Concept: Multi-source BFS
Approach: Spread the rotting process level by level using a queue


Problem Link:
https://leetcode.com/problems/rotting-oranges/
*/
import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length, fcount = 0;
        if (grid == null || grid.length == 0)
            return 0;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1)
                    fcount++;
                if (grid[i][j] == 2)
                    q.add(new int[] { i, j });
            }
        }
        int minute = 0;
        while (!q.isEmpty() && fcount > 0) {
            minute++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();
                int r = cur[0], c = cur[1];
                int dir[][] = { { r, c + 1 }, { r, c - 1 }, { r - 1, c }, { r + 1, c } };
                for (int[] dirr : dir) {
                    int nr = dirr[0], nc = dirr[1];
                    if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;
                        fcount--;
                        q.add(new int[] { nr, nc });
                    }
                }
            }
        }
        return (fcount == 0) ? minute : -1;

    }
}