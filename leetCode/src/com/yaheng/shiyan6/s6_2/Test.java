package com.yaheng.shiyan6.s6_2;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(99);
        list.add(4);
        list.add(65);
        list.add(7);
        list.add(1);
        list.add(7);
        list.add(1);
        list.add(99);
        System.out.println(list);
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num = sc.nextInt();
        boolean flag = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(num)){
                flag = true;
                System.out.println(num + "在集合中的下标为：" + i);
            }
        }
        if (!flag){
            System.out.println("查找失败，集合中无该数字。");
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println("去重之后集合为：" + list);
    }
}
