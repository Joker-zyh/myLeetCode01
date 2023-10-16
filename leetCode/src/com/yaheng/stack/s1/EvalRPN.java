package com.yaheng.stack.s1;

import java.util.Deque;
import java.util.LinkedList;

public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < tokens.length; i++) {
            if ("+".equals(tokens[i]))
                stack.push(stack.pop() + stack.pop());
            else if ("-".equals(tokens[i]))
                stack.push(-stack.pop() + stack.pop());
            else if ("*".equals(tokens[i]))
                stack.push(stack.pop() * stack.pop());
            else if ("/".equals(tokens[i])){
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 / num1);
            }
            else
                stack.push(Integer.valueOf(tokens[i]));
        }
        return stack.pop();

    }
}
