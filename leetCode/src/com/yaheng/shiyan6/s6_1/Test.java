package com.yaheng.shiyan6.s6_1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add(123);
        list.add(6.9);
        list.add("hello");
        list.add("");
        list.add("Hello");
        list.add(new StringBuffer("hello"));

        System.out.println(list);

        System.out.println("元素hello在集合中最早出现的下标为：" + list.indexOf("hello"));

        list.remove("hello");

        list.set(list.indexOf(123),1000);
        System.out.println(list);
    }
}
