package com.yaheng.stack.s1;

import java.util.Deque;
import java.util.LinkedList;

public class DeleteSame {
    public String removeDuplicates(String s) {
        Deque<Character> myStack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            if ( myStack.isEmpty() || myStack.peek() != s.charAt(i)){
                myStack.push(s.charAt(i));
            }else
                myStack.pop();
        }
        String s1 = "";
        while (myStack.size() != 0){
            s1 = myStack.pop() + s1;
        }
        return s1;
    }
}
