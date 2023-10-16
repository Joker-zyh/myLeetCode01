package com.yaheng.tanxin;

import java.util.ArrayList;
import java.util.List;

public class Solution19 {
    public List<Integer> partitionLabels(String s) {
        int[] hash = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            hash[chars[i] -'a'] = i;
        }

        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            right = Math.max(right,hash[chars[i] - 'a']);
            if (i == right){
                list.add(right - left + 1);
                left = right + 1;
            }
        }
        return list;
    }
}
