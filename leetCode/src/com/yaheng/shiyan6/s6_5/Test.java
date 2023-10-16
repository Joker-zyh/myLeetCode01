package com.yaheng.shiyan6.s6_5;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三",100);
        Student s2 = new Student("李四",120);
        Student s3 = new Student("王五",99);
        Student s4 = new Student("麻子",80);
        Student s5 = new Student("老王",110);

        Set<Student> set = new TreeSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        System.out.println(set);
    }
}
