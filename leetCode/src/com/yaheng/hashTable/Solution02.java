package com.yaheng.hashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution02 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> result = new HashSet<>();
        int[] hashTable = new int[1001];
        for (int num : nums1) {
            hashTable[num] = 1;
        }
        for (int num : nums2){
            if (hashTable[num] == 1){
                result.add(num);
            }
        }
        int[] arr = new int[result.size()];
        int j = 0;
        for (int num : result) {
            arr[j++] = num;
        }
        return arr;
        /*int[] array = result.stream().mapToInt(i -> i).toArray();
        return array;*/

    }


    /*public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        int[] arr = new int[set2.size()];
        int j = 0;
        for (int num : set2) {
            arr[j++] = num;
        }
        return arr;
    }*/
}
