package com.yaheng.string;

import java.util.Arrays;

public class ReplaceSpace {
    public String replaceSpace(String s) {
        char[] arr = s.toCharArray();
        int count =  0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ' '){
                count++;
            }
        }
        int front = arr.length - 1;
        arr = Arrays.copyOf(arr,arr.length + count*2);
        int tail = arr.length - 1;
        while (front >= 0){
            if (arr[front] == ' '){
                arr[tail--] = '0';
                arr[tail--] = '2';
                arr[tail] = '%';
            }else {
                arr[tail] = arr[front];
            }
            front--;
            tail--;
        }
        return new String(arr);
    }
}
