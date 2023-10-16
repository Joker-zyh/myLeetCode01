package com.yaheng.stack.s1;

import java.util.Queue;
import java.util.Stack;

class MyQueue {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;
    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        if(stackOut.empty()){
            while (!stackIn.empty()){
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.pop();
    }

    public int peek() {
        int elem = this.pop();
        stackOut.push(elem);
        return elem;
    }

    public boolean empty() {
        if(stackIn.empty() && stackOut.empty())
            return true;
        else
            return false;
    }
}
