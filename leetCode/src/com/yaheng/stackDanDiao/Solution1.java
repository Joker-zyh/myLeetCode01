package com.yaheng.stackDanDiao;

import com.yaheng.stack.Stack;

import java.util.Deque;
import java.util.LinkedList;

public class Solution1 {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new LinkedList<>();
        int[] ans = new int[temperatures.length];

        stack.push(0);
        for (int i = 1;i < temperatures.length;i++){
            if (temperatures[stack.peek()] >= temperatures[i]){
                stack.push(i);
            }else{
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                    ans[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }
        }
        return ans;
    }
}
