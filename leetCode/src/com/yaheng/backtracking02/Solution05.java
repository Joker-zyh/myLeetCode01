package com.yaheng.backtracking02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution05 {
    private List<List<Integer>> list = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();
    boolean[] using;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        using = new boolean[candidates.length];
        Arrays.fill(using,false);
        Arrays.sort(candidates);
        backTracking(candidates,target,0,0,using);
        return list;
    }

    private void backTracking(int[] candidates,int target,int startIndex,int sum,boolean[] using){
        if (sum == target){
            list.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i < candidates.length && sum + candidates[i] <= target;i++){
            if (i>0 && candidates[i] == candidates[i-1] && using[i -1] == false){
                continue;
            }
            path.add(candidates[i]);
            sum += candidates[i];
            using[i] = true;
            backTracking(candidates,target,i + 1,sum,using);
            path.removeLast();
            sum -= candidates[i];
            using[i] = false;
        }
    }
}
