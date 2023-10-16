package com.yaheng.tu;

public class Solution07 {
    private int[][] dif = new int[][]{new int[]{0,1},new int[]{1,0},new int[]{0,-1},new int[]{-1,0}};
    private int count = 0;
    private int ans;
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !visited[i][j]){
                    count = 1;
                    dfs(grid,visited,i,j);
                    ans = Math.max(ans,count);
                }
            }
        }
        return ans;
    }

    private void dfs(int[][] grid,boolean[][] visited,int x,int y){
        for (int i = 0; i < 4;i++){
            int nextX = x + dif[i][0];
            int nextY = y + dif[i][1];
            if (nextX < 0 || nextX >= grid.length || nextY < 0 || nextY >= grid[0].length) continue;
            if (grid[nextX][nextY] == 1 && !visited[nextX][nextY]){
                visited[nextX][nextY] = true;
                count++;
                dfs(grid,visited,nextX,nextY);
            }
        }
    }
}
