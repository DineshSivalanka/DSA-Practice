/* 
Number of Islands (Problem 200)
Concept: Graph Traversal on Grid
Approach: DFS and BFS to count connected components (islands)

Problem Link:
https://leetcode.com/problems/number-of-islands/
*/

class Solution {
    public static void dfs(char[][] grid,boolean[][] visited,int i,int j,int m,int n){
        if(i<0||j<0||i>=m||j>=n||visited[i][j]||grid[i][j]=='0') return;
        visited[i][j]=true;
        dfs(grid,visited,i,j-1,m,n);
        dfs(grid,visited,i,j+1,m,n);
        dfs(grid,visited,i+1,j,m,n);
        dfs(grid,visited,i-1,j,m,n);
    }
    public int numIslands(char[][] grid) {
        int m=grid.length,n=grid[0].length, count=0;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    dfs(grid,visited,i,j,m,n);
                    count++;
                }
            }
        }
        return count;
    }
}





