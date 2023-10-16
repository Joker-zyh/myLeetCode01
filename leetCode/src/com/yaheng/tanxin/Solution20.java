package com.yaheng.tanxin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution20 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

        LinkedList<int[]> list = new LinkedList<>();
        list.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= list.getLast()[1]){
                list.getLast()[1] = Math.max(list.getLast()[1],intervals[i][1]);
            }else {
                list.add(intervals[i]);
            }
        }
        return list.toArray(new int[list.toArray().length][]);
    }
}
