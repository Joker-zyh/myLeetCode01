package com.yaheng.shiyan6.s6_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
        System.out.println("请输入整数，输入0时停止：");
        while (true){
            int num = sc.nextInt();
            if (num == 0)
                break;
            if (map.containsKey(num)){
                int val = map.get(num);
                map.put(num,++val);
            }else {
                map.put(num,1);
            }
        }

        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        int max = 0;
        for (Map.Entry<Integer,Integer> e:set
             ) {
            max = max > e.getValue()?max:e.getValue();
        }
        System.out.println("出现频率最高的有：");
        for (Map.Entry<Integer,Integer> e:set
             ) {
            if (e.getValue() == max){
                System.out.print(e.getKey() + " ");
            }
        }
    }
}
