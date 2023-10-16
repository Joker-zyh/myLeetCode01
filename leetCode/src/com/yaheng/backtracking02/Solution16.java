package com.yaheng.backtracking02;

import java.util.*;

public class Solution16 {
    private List<List<Integer>> list = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();
    private boolean[] using;

    public List<List<Integer>> permuteUnique(int[] nums) {
        using = new boolean[nums.length];
        Arrays.fill(using,false);
        Arrays.sort(nums);
        backTracking(nums);
        return list;
    }

    private void backTracking(int[] nums) {
        if (path.size() == nums.length){
            list.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0;i < nums.length;i++){
            if (using[i] || (i > 0 && nums[i] == nums[i - 1] && !using[i - 1])){
                continue;
            }
            using[i] =true;
            path.add(nums[i]);
            backTracking(nums);
            path.removeLast();
            using[i] = false;
        }
    }

    /*private void backTracking(int[] nums) {
        if (path.size() == nums.length){
            list.add(new ArrayList<>(path));
            return;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0;i < nums.length;i++){
            if (using[i] || hashSet.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            using[i] = true;
            hashSet.add(nums[i]);
            backTracking(nums);
            path.removeLast();
            using[i] = false;
        }
    }*/
}
