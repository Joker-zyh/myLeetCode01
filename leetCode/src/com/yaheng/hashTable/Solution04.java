package com.yaheng.hashTable;

import java.util.HashMap;
import java.util.Map;

public class Solution04 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if(nums == null || nums.length == 0){
            return res;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ;i < nums.length;i++){
            int key = target - nums[i];
            if (map.containsKey(key)) {
                res[0] = i;
                res[1] = map.get(key);
                break;
            }else {
                map.put(nums[i],i);
            }
        }
        return res;
    }
}
