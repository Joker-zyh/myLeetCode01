package com.yaheng.tu;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution06 {
    private int[][] dif = {new int[]{0,1},new int[]{1,0},new int[]{0,-1},new int[]{-1,0}};
    public void solve(char[][] board) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        int row = board.length;
        int col = board[0].length;

        for (int i = 0; i < row; i++) {
            if (board[i][0] == 'O') bfs(board,visited,i,0);
            if (board[i][col-1] == 'O') bfs(board,visited,i,col-1);
        }

        for (int i = 0; i < col; i++) {
            if (board[0][i] == 'O') bfs(board,visited,0,i);
            if (board[row-1][i] == 'O') bfs(board,visited,row-1,i);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'O' && !visited[i][j]){
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void bfs(char[][] board,boolean[][] visited,int x,int y){
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{x,y});
        visited[x][y] = true;

        while (!queue.isEmpty()){
            int[] cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = cur[0] + dif[i][0];
                int nextY = cur[1] + dif[i][1];
                if (nextX < 0 || nextX >= board.length || nextY < 0 || nextY >= board[0].length)continue;
                if (board[nextX][nextY] == 'O' && !visited[nextX][nextY]){
                    visited[nextX][nextY] = true;
                    queue.add(new int[]{nextX,nextY});
                }
            }
        }
    }
}
