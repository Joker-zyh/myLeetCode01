package com.yaheng.stackDanDiao;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Solution03 {
    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer> stack = new LinkedList<>();
        int[] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        stack.push(0);

        next(1,nums,stack,ans);
        next(0,nums,stack,ans);
        return ans;
    }

    public void next(int index,int[] nums,Deque<Integer> stack,int[] ans){
        for (int i = index;i < nums.length;i++){
            if (nums[i] <= nums[stack.peek()]){
                stack.push(i);
            }else {
                while (!stack.isEmpty() && nums[i] > nums[stack.peek()]){
                    ans[stack.peek()] = nums[i];
                    stack.pop();
                }
                stack.push(i);
            }
        }
    }
}
