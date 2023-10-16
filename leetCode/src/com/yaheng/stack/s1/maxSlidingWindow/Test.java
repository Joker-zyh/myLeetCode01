package com.yaheng.stack.s1.maxSlidingWindow;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        MaxSlidingWindow maxSlidingWindow = new MaxSlidingWindow();
        int[] tmp = maxSlidingWindow.maxSlidingWindow(arr,3);
        for (int k: tmp){
            System.out.print(k + " ");
        }
    }
}
