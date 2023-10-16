package com.yaheng.tanxin;

public class Solution13 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
        for (int bill : bills) {
            switch (bill){
                case 5:
                    five++;
                    break;
                case 10:
                    if (five <= 0) return false;
                    ten++;
                    five--;
                    break;
                case 20:
                    if (ten > 0 && five >0){
                        ten--;
                        five--;
                    }else if (five >=3){
                        five -= 3;
                    }else return false;
            }
        }
        return true;
    }
}
