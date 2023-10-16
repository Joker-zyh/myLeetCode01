package com.yaheng.backtracking02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution08 {
    private List<List<Integer>> list = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backTracking(nums,0);
        return list;
    }

    private void backTracking(int[] nums,int startIndex){
        list.add(new ArrayList<>(path));
        if (startIndex == nums.length){
            return;
        }
        for (int i =startIndex; i <nums.length;i++){
            path.add(nums[i]);
            backTracking(nums,i+1);
            path.removeLast();
        }
    }
}
