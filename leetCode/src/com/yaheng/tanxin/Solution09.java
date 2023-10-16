package com.yaheng.tanxin;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution09 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        nums = IntStream.of(nums)
                .boxed()
                .sorted(((o1, o2) -> Math.abs(o2) - Math.abs(o1)))
                .mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k > 0){
                nums[i] *= -1;
                k--;
            }
        }

        if (k % 2 == 1){
            nums[nums.length - 1] *= -1;
        }
        return Arrays.stream(nums).sum();

        /*Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0){
                nums[i] = -nums[i];
                k--;
            }else if (nums[i] == 0){
                k = 0;
            }else {
                Arrays.sort(nums);
                while (k > 0){
                    nums[0] = -nums[0];
                    k--;
                }
            }
            if (k == 0){
                break;
            }
        }
        if (k % 2 == 1){
            Arrays.sort(nums);
            nums[0] *= -1;
        }
        return Arrays.stream(nums).sum();*/
    }
}
