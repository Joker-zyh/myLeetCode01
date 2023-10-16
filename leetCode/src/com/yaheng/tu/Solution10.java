package com.yaheng.tu;

public class Solution10 {
    private int[] father = new int[200000];
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        for (int i = 0; i < father.length; i++) {
            father[i] = i;
        }

        for (int i = 0; i < edges.length; i++) {
            join(edges[i][0],edges[i][1]);
        }
        return isSame(source,destination);

    }

    private boolean isSame(int u,int v){
        u = find(u);
        v = find(v);
        return u == v;
    }

    private void join(int u,int v){
        u = find(u);
        v = find(v);
        if (u == v) return;
        father[v] = u;
    }


    private int find(int u){
        if (u == father[u]) return u;
        return father[u] = find(father[u]);
    }
}
