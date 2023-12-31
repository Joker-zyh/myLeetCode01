package com.yaheng.tanxin;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution14 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a ,b) ->{
            if (a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });

        LinkedList<int[]> list = new LinkedList<>();
        for (int[] arr : people) {
            list.add(arr[1],arr);
        }
        return list.toArray(new int[people.length][]);
    }
}
