package com.yaheng.hashTable;

import java.util.HashSet;

public class Solution03 {
    public boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        while (true){
            int sum = getSum(n);
            if (sum == 1){
                return true;
            }
            if (hashSet.contains(sum)){
                return false;
            }else {
                hashSet.add(sum);
            }
            n = sum;
        }
    }

    private int getSum(int n) {
        int sum = 0;
        while (n > 0){
            int temp = n % 10;
            sum += temp * temp;
            n /= 10;
        }
        return sum;
    }
}
