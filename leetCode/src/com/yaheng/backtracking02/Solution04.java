package com.yaheng.backtracking02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution04 {
    private List<List<Integer>> list = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTracking(candidates,target,0,0);
        return list;
    }

    private void backTracking(int[] candidates,int target,int startIndex,int sum){
        if(sum == target){
            list.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex;i < candidates.length && sum + candidates[i] <= sum;i++){
            path.add(candidates[i]);
            sum += candidates[i];
            backTracking(candidates,target,i,sum);
            path.removeLast();
            sum -= candidates[i];
        }

    }
}
