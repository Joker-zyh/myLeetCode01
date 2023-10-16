package com.yaheng.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> list = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTracking(candidates,target,0,0);
        return list;
    }

    void backTracking(int[] candidates,int target,int sum,int startIndex){
        //终止
        if(target == sum){
            list.add(new ArrayList<>(path));
            return;
        }
        //处理，弹出
        for (int i = startIndex; i < candidates.length && sum + candidates[i] <target; i++) {
            int num = candidates[i];
            path.add(num);
            sum += num;
            backTracking(candidates,target,sum,i);
            sum -= num;
            path.removeLast();
        }
    }
}
