package com.yaheng.tanxin;

public class Solution11 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            int rest = gas[i] - cost[i];
            int index = (i + 1) % gas.length;
            while (rest >= 0 && index != i) {
                rest += gas[index] - cost[index];
                index = (index + 1) % gas.length;
            }
            if (rest >=0 && index == i){
                return i;
            }
        }
        return -1;
    }


    /*public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            int accrue = 0;
            int index = i;
            while (true){
                accrue += gas[index];
                if (accrue >= cost[index]){
                    accrue -= cost[index];
                    index++;
                }else {
                    break;
                }
                if (index == gas.length){
                    index = 0;
                }
                if (index == i){
                    return i;
                }
            }
        }
        return -1;
    }*/
}
