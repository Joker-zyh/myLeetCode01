package com.yaheng.string;

public class Reverse2K {
    public String reverseStr(String s, int k) {
        char[] s1 = s.toCharArray();
        for (int i = 0; i < s.length(); i = i + 2*k) {
            if (i + k <= s1.length - 1){
                reverse(s1,i,i + k - 1);
            }else{
                reverse(s1,i,s1.length - 1);
            }
        }
        return new String(s1);
    }

    public void reverse(char[] s,int front,int tail){
        while (front < tail) {
            char tmp = s[front];
            s[front] = s[tail];
            s[tail] = tmp;
            front++;
            tail--;
        }
    }
}
