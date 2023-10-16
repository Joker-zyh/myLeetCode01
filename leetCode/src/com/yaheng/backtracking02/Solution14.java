package com.yaheng.backtracking02;

import java.util.*;

public class Solution14 {
    private List<List<Integer>> list = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        backTracking(nums,0);
        return list;
    }

    private void backTracking(int[] nums, int startIndex) {
        if (path.size() > 1){
            list.add(new ArrayList<>(path));
        }
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = startIndex; i <nums.length;i++){
            if ((!path.isEmpty() && nums[i] < path.getLast())
                    || hashSet.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            hashSet.add(nums[i]);
            backTracking(nums,i + 1);
            path.removeLast();
        }
    }
}
