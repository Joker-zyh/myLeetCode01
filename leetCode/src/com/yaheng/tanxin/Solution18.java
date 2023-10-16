package com.yaheng.tanxin;

import java.util.Arrays;

public class Solution18 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

        int result = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i -1][1]){
                intervals[i][1] = Math.min(intervals[i - 1][1],intervals[i][1]);
            }else {
                result++;
            }
        }
        return intervals.length - result;
    }
}
