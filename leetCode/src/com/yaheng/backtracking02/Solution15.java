package com.yaheng.backtracking02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution15 {
    private List<List<Integer>> list = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();
    private boolean[] using;
    public List<List<Integer>> permute(int[] nums) {
        using = new boolean[nums.length];
        Arrays.fill(using,false);
        backTracking(nums);
        return list;
    }

    private void backTracking(int[] nums) {
        if (path.size() == nums.length){
            list.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0;i < nums.length;i++){
            if (using[i]){
                continue;
            }
            path.add(nums[i]);
            using[i] = true;
            backTracking(nums);
            path.removeLast();
            using[i] = false;
        }
    }
}
