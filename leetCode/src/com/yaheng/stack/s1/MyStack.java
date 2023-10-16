package com.yaheng.stack.s1;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
//        queue2.offer(x);
//        while (!queue1.isEmpty()){
//            queue2.offer(queue1.poll());
//        }
//        Queue<Integer> q3 = queue1;
//        queue1 = queue2;
//        queue2 = q3;

        queue1.offer(x);
        for (int i = 0; i < queue1.size() - 1; i++) {
            int elem = queue1.poll();
            queue1.offer(elem);
        }

    }

    public int pop() {
       return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        if (queue1.isEmpty())
            return true;
        else
            return false;
    }
}
