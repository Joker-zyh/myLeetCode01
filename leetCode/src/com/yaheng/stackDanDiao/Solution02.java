package com.yaheng.stackDanDiao;

import java.util.*;

public class Solution02 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Arrays.fill(ans,-1);
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i],i);
        }

        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);
        for (int i = 1;i < nums2.length;i++){
            if (nums2[i] < nums2[stack.peek()]){
                stack.push(i);
            }else{
                while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]){
                    if (map.containsKey(nums2[stack.peek()])){
                        ans[map.get(nums2[stack.peek()])] = nums2[i];
                    }
                    stack.pop();
                }
                stack.push(i);
            }
        }
        return ans;
    }
}
