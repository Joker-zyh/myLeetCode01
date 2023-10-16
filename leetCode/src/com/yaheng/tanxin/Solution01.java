package com.yaheng.tanxin;

import java.util.Arrays;

public class Solution01 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int index = 0;
        for (int i = 0; i < s.length; i++) {
            if (index < g.length && s[i] >= g[index]){
                index++;
            }
        }
        return index;
    }
}
