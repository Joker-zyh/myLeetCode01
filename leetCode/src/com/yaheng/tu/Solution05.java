package com.yaheng.tu;

import java.util.Deque;
import java.util.LinkedList;

public class Solution05 {
    private int[][] dif = {new int[]{0,1},new int[]{1,0},new int[]{-1,0},new int[]{0,-1}};
    public int numEnclaves(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row;i++){
            if (grid[i][0] == 1){
                bfs(grid,i,0);
            }
            if (grid[i][col-1] == 1){
                bfs(grid,i,col-1);
            }
        }
        for (int i = 0; i < col;i++){
            if (grid[0][i] == 1){
                bfs(grid,0,i);
            }
            if (grid[row-1][i] == 1){
                bfs(grid,row-1,i);
            }
        }
        int ans = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1)ans++;
            }
        }
        return ans;
    }

    private void bfs(int[][] grid,int x,int y){
        Deque<int[]> deque = new LinkedList<>();
        deque.push(new int[]{x,y});
        grid[x][y] = 0;

        while (!deque.isEmpty()){
            int[] cur = deque.pop();
            int curX = cur[0];
            int curY = cur[1];
            for (int i = 0; i < 4; i++) {
                int nextX = curX + dif[i][0];
                int nextY = curY + dif[i][1];
                if (nextX < 0 || nextX >= grid.length || nextY < 0 || nextY >= grid[0].length) continue;
                if (grid[nextX][nextY] == 1){
                    grid[nextX][nextY] = 0;
                    deque.push(new int[]{nextX,nextY});
                }
            }
        }
    }
}
