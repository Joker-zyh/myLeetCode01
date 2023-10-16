package com.yaheng.string;

public class Reverse {
    public String reverseString(String s1) {
        int front = 0;
        int tail = s1.length() - 1;
        char[] s = s1.toCharArray();

        while (front < tail) {
            char tmp = s[front];
            s[front] = s[tail];
            s[tail] = tmp;
            front++;
            tail--;
        }
        return new String(s);
    }
}
