package com.yaheng.stack;

import org.w3c.dom.Node;

public class StackTest {
    public static void main(String[] args) {
        //创建栈
        Stack<String> stack = new Stack<>();
        
        //压栈
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");

        for (String item :
                stack) {
            System.out.println(item);
        }

        System.out.println("----------------------");
        //弹栈
        while (stack.size() > 0) {
            String ele = stack.pop();
            System.out.println("弹出的元素为：" + ele);
            System.out.println("栈中剩余的元素个数为：" + stack.size());
        }

    }
}
