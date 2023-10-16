package com.yaheng.tanxin;

import java.util.Arrays;

public class Solution22 {
    public int monotoneIncreasingDigits(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int flag = chars.length;
        for (int i = chars.length - 1; i > 0; i--) {
            if (chars[i] < chars[i - 1]){
                flag = i;
                chars[i - 1]--;
            }
        }
        for (int i = chars.length - 1; i >= flag; i--){
            chars[i] = '9';
        }

        return Integer.parseInt(String.valueOf(chars));
    }

    /*public int monotoneIncreasingDigits(int n) {
        while (n > 0){
            if (isDiZeng(n)){
                return n;
            }
            n--;
        }
        return 0;
    }

    public boolean isDiZeng(int n){
        char[] chars = String.valueOf(n).toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] < chars[i-1]){
                return false;
            }
        }
        return true;
    }*/
}
