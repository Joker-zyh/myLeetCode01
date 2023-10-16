package com.yaheng.stack.s1.maxSlidingWindow;

public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length - k + 1;
        int[] arr = new int[len];
        MyQueue myQueue = new MyQueue();

        for (int i = 0; i < k; i++) {
            myQueue.push(nums[i]);
        }
        int count = 0;
        arr[count++] = myQueue.getMaxVlue();
        for (int i = k; i < nums.length; i++) {
            myQueue.pop(nums[i - k]);
            myQueue.push(nums[i]);
            arr[count++] = myQueue.getMaxVlue();
        }
        return arr;

    }
}
