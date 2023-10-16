package com.yaheng.shiyan6.s6_3;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> list = new ArrayList<>();

        while (list.size() < 10){
            int num = r.nextInt(101) + 350;
            if (!list.contains(num)){
                list.add(num);
            }
        }

        Set<Integer> set = new HashSet<>();
        while (set.size() < 10)
            set.add(r.nextInt(101) + 350);

        System.out.println("list:" + list);
        System.out.println("set:" + set);
    }
}
