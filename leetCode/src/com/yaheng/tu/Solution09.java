package com.yaheng.tu;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Solution09 {
    private int[][] dif = {new int[]{0,1},new int[]{-1,0},new int[]{1,0},new int[]{0,-1}};
    private int counter = 0;
    private Map<Integer,Integer> map = new HashMap<>();
    public int largestIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int mark = 2;
        boolean isAllGrid = true;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) isAllGrid = false;
                if (grid[i][j] == 1 && !visited[i][j]){
                    counter = 0;
                    visited[i][j] = true;
                    dfs(grid,visited,i,j,mark);
                    map.put(mark,counter);
                    mark++;
                }
            }
        }
        if (isAllGrid) return grid.length * grid[0].length;

        int ans = 0;
        int curSize = 0;
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0){
                    curSize = 1;
                    set.clear();
                    for ( int[] next:dif) {
                        int nextX = next[0] + i;
                        int nextY = next[1] + j;

                        if (nextX < 0 || nextY < 0 || nextX >= grid.length || nextY >= grid[0].length) continue;
                        int curMark = grid[nextX][nextY];
                        if (set.contains(curMark) || !map.containsKey(curMark)) continue;
                        set.add(curMark);
                        curSize += map.get(curMark);

                    }
                }
                ans = Math.max(ans,curSize);
            }
        }
        return ans;
    }

    private void dfs(int[][] grid,boolean[][] visited,int x,int y,int mark){
        if (visited[x][y] && grid[x][y] == 0){
            return;
        }
        visited[x][y] = true;
        counter++;
        grid[x][y] = mark;
        for ( int[] next:dif) {
            int nextX = next[0] + x;
            int nextY = next[1] + y;

            if (nextX < 0 || nextY < 0 || nextX >= grid.length || nextY >= grid[0].length) continue;
            dfs(grid, visited,nextX, nextY, mark);
        }
    }

}
