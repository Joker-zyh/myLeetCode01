package com.yaheng.stack.s1;

public class Test {
    public static void main(String[] args) {
        EvalRPN evalRPN = new EvalRPN();
        String[] strings = {"4","13","5","/","+"};
        System.out.println(evalRPN.evalRPN(strings));
    }
}
