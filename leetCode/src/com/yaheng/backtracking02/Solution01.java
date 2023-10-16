package com.yaheng.backtracking02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution01 {
    private List<List<Integer>> list = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        backTracking(n,k,1);
        return list;
    }

    private void backTracking(int n,int k,int startIndex){
        if(path.size() == k){
            list.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i <= n ; i++) {
            path.add(i);
            backTracking(n,k,i + 1);
            path.removeLast();
        }
    }
}
