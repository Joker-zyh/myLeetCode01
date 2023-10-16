package com.yaheng.tu;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {
    private int[][] dif = new int[][]{new int[]{0,1},new int[]{1,0},new int[]{0,-1},new int[]{-1,0}};
    private List<Integer> path = new ArrayList<>();
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1'){
                    ans++;
                    visited[i][j] = true;
                    dfs(grid,visited,i,j);
                }
            }
        }
        return ans;
    }

    void dfs(char[][] grid, boolean[][] visited,int x, int y){
        for (int i = 0; i < 4;i++){
            int nextX = x + dif[i][0];
            int nextY = y + dif[i][1];
            if (nextX < 0 || nextX >= grid.length || nextY < 0 || nextY >= grid[0].length) continue;
            if (!visited[nextX][nextY] && grid[nextX][nextY] == '1'){
                visited[nextX][nextY] = true;
                dfs(grid,visited,nextX,nextY);
            }
        }

    }
}
