package com.yaheng.shiyan6.s6_4;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("小明",18);
        Person p2 = new Person("小红",17);
        Person p3 = new Person("小明",55);

        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
