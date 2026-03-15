/*
Flood Fill (Problem 733)
Concept: DFS on Grid
Approach: Traverse connected pixels and update the color

Problem Link:
https://leetcode.com/problems/flood-fill/
*/

class Solution {
    public static void dfs(int[][] image, int i, int j, int color, int ocolor) {
        int m = image.length;
        int n = image[0].length;
        image[i][j] = color;
        if (i > 0 && image[i - 1][j] == ocolor)
            dfs(image, i - 1, j, color, ocolor);
        if (j + 1 < n && image[i][j + 1] == ocolor)
            dfs(image, i, j + 1, color, ocolor);
        if (j > 0 && image[i][j - 1] == ocolor)
            dfs(image, i, j - 1, color, ocolor);
        if (i + 1 < m && image[i + 1][j] == ocolor)
            dfs(image, i + 1, j, color, ocolor);

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ocolor = image[sr][sc];
        if (ocolor != color) {
            dfs(image, sr, sc, color, ocolor);
        }
        return image;
    }
}