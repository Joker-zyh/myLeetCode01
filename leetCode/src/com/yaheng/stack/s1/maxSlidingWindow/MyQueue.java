package com.yaheng.stack.s1.maxSlidingWindow;

import java.util.Deque;
import java.util.LinkedList;

public class MyQueue {
    Deque<Integer> deque = new LinkedList<>();

    void push(int val){
        while (!deque.isEmpty() && val > deque.peekLast()){
            deque.pollLast();
        }
        deque.offerLast(val);
    }

    void pop(int val){
        if (!deque.isEmpty() && val == deque.peekFirst()){
            deque.pollFirst();
        }
    }

    int getMaxVlue(){
        return deque.peekFirst();
    }
}
