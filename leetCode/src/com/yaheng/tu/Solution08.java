package com.yaheng.tu;

import java.util.ArrayList;
import java.util.List;

public class Solution08 {
    private int[][] dif = new int[][]{new int[]{0,1},new int[]{1,0},new int[]{0,-1},new int[]{-1,0}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        boolean[][] pacific = new boolean[heights.length][heights[0].length];
        boolean[][] atlantic  = new boolean[heights.length][heights[0].length];

        for (int i = 0; i < heights.length; i++) {
            dfs(heights,pacific,i,0);
            dfs(heights,atlantic,i,heights[0].length -1);
        }
        for (int i = 0; i < heights[0].length; i++) {
            dfs(heights,pacific,0,i);
            dfs(heights,atlantic,heights.length-1,i);
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                if (pacific[i][j] && atlantic[i][j]){
                    ans.add(List.of(i,j));
                }
            }
        }
        return ans;
    }

    private void dfs(int[][] heights,boolean[][] visited,int x,int y){
        if (!visited[x][y]) return;
        visited[x][y] = true;
        for (int[] next : dif) {
            int nextX = x + next[0];
            int nextY = y + next[1];
            if (nextX < 0 || nextX >= heights.length || nextY < 0 || nextY >= heights[0].length) continue;
            if (heights[x][y] > heights[nextX][nextY]) continue;
            dfs(heights,visited,nextX,nextY);
        }
    }
}
