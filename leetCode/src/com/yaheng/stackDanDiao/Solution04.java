package com.yaheng.stackDanDiao;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

public class Solution04 {
    public int trap(int[] height) {
        int[] leftHeight = new int[height.length];
        int[] rightHeight = new int[height.length];

        leftHeight[0] = height[0];
        for (int i = 1;i < height.length;i++){
            leftHeight[i] = Math.max(height[i],leftHeight[i-1]);
        }

        rightHeight[height.length -1] = height[height.length-1];
        for (int i = height.length-2;i >= 0;i--){
            rightHeight[i] = Math.max(height[i],rightHeight[i+1]);
        }

        int sum = 0;
        for (int i = 0; i < height.length;i++){
            int water = Math.min(leftHeight[i],rightHeight[i]) - height[i];
            if (water > 0) sum += water;
        }
        return sum;

    }
}
