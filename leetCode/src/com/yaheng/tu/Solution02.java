package com.yaheng.tu;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution02 {
    private int[][] dif = new int[][]{new int[]{0,1},new int[]{1,0},new int[]{0,-1},new int[]{-1,0}};
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int ans = 0;
        for (int i = 0; i < grid.length;i++){
            for (int j = 0; j < grid[0].length;j++){
                if (grid[i][j] == '1' && !visited[i][j]){
                    ans++;
                    bfs(grid,visited,i,j);
                }
            }
        }
        return ans;
    }

    void bfs(char[][] grid,boolean[][] visited,int x,int y) {
        Deque<int[]> deque = new LinkedList<>();
        deque.push(new int[]{x, y});
        visited[x][y] = true;

        while (!deque.isEmpty()) {
            int[] cur = deque.pop();
            int curX = cur[0];
            int curY = cur[1];
            for (int i = 0; i < 4; i++) {
                int nextX = curX + dif[i][0];
                int nextY = curY + dif[i][1];
                if (nextX < 0 || nextX >= grid.length || nextY < 0 || nextY >= grid[0].length) continue;
                if (!visited[nextX][nextY] && grid[nextX][nextY] == '1') {
                    deque.push(new int[]{nextX, nextY});
                    visited[nextX][nextY] = true;
                }
            }
        }
    }
}
