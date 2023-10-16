package com.yaheng.backtracking02;

import java.util.*;

public class Solution09 {
    private List<List<Integer>> list = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();
    private boolean[] using;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        using = new boolean[nums.length];
        Arrays.fill(using,false);
        Arrays.sort(nums);
        backTracking(nums,0);
        return list;
    }

    private void backTracking(int[] nums,int startIndex){
        list.add(new ArrayList<>(path));
        if (startIndex == nums.length){
            return;
        }

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = startIndex;i < nums.length;i++){
            /*if (i > 0 && nums[i] == nums[i - 1] && !using[i - 1]){
                continue;
            }*/
            if (hashSet.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            hashSet.add(nums[i]);
            //using[i] =true;
            backTracking(nums,i + 1);
            path.removeLast();
            //using[i] = false;
        }
    }
}
