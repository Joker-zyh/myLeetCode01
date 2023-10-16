package com.yaheng.tu;

import java.util.Deque;
import java.util.LinkedList;

public class Solution04 {
    private int[][] dif = new int[][]{new int[]{0,1},new int[]{1,0},new int[]{0,-1},new int[]{-1,0}};
    private int count = 0;
    private int ans = 0;
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == 1){
                    count = 1;
                    bfs(grid,visited,i,j);
                    ans = Math.max(ans,count);
                }
            }
        }
        return ans;
    }

    private void bfs(int[][] grid,boolean[][] visited,int x,int y){
        Deque<int[]> stack = new LinkedList<>();
        stack.push(new int[]{x,y});
        visited[x][y] = true;

        while (!stack.isEmpty()){
            int[] cur = stack.pop();
            int curX = cur[0];
            int curY = cur[1];
            for (int i = 0; i < 4; i++) {
                int nextX = curX + dif[i][0];
                int nextY = curY + dif[i][1];
                if (nextX < 0 || nextY < 0 || nextX >= grid.length || nextY >= grid[0].length) continue;
                if (!visited[nextX][nextY] && grid[nextX][nextY] == 1){
                    count++;
                    visited[nextX][nextY] = true;
                    stack.push(new int[]{nextX,nextY});
                }
            }
        }
    }
}
