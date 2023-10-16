package com.yaheng.tu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution01 {
    private List<List<Integer>> list = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        path.add(0);
        dfs(graph,0);
        return list;
    }

    private void dfs(int[][] graph,int x){
        if (path.get(path.size()-1) == graph.length-1){
            list.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0;i < graph[x].length;i++){
            path.add(graph[x][i]);
            dfs(graph,graph[x][i]);
            path.remove(path.size() -1);
        }
    }
}
