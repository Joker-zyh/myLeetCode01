package com.yaheng.string;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        int[] next = new int[length];
        getNext(next, s);
        if (next[length - 1] != -1 && (length % (length - (next[length - 1] + 1))) == 0){
            return true;
        }
        return false;

    }

    public void getNext(int[] next,String s){
        int j = -1;
        next[0] = j;

        for (int i = 1; i < s.length(); i++) {
            while (j >= 0 && s.charAt(j + 1) != s.charAt(i)){
                j = next[j];
            }
            if (s.charAt(j + 1) == s.charAt(i)){
                j++;
            }
            next[i] = j;
        }

    }

}
