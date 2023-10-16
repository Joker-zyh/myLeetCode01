package com.yaheng.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum2 {
    List<List<Integer>> list = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTracking(candidates,target,0,0);
        return list;
    }

    void backTracking(int[] candidates, int target,int sum,int startIndex){
        //
        if(sum == target){
            list.add(new ArrayList<>(path));
            return;
        }
        //
        for (int i = startIndex; i < candidates.length && sum + candidates[i] <= target; i++) {
            if(i > startIndex && candidates[i] == candidates[i - 1])
                continue;
            int num = candidates[i];
            path.add(num);
            sum += num;
            backTracking(candidates,target,sum,i + 1);
            sum -= num;
            path.removeLast();
        }
    }
}
