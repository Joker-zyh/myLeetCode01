package com.yaheng.string;

public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        char[] arr = s.toCharArray();
        int length = arr.length;
        reverse(arr,0,length - 1);
        reverse(arr,0,length - n - 1);
        reverse(arr,length - n,length - 1);
        return new String(arr);


    }

    public void reverse(char[] s,int front,int tail){
        while (front < tail) {
            char tmp = s[front];
            s[front] = s[tail];
            s[tail] = tmp;
            front++;
            tail--;
        }

}}
