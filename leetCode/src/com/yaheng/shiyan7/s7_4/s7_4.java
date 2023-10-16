package com.yaheng.shiyan7.s7_4;

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class s7_4 {
    public static void main(String[] args) throws Exception {
        System.out.println("请输入内容：");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();


        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\java实验\\实验7_4_1.txt"));
        bw.write(s);
        System.out.println("成功加入");
        bw.close();

        ObjectOutputStream oops = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("E:\\java实验\\实验7_4_1.txt")));
        TreeSet<Student> treeSet = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            System.out.println("请输入学生" + (i+1) +"的姓名：");
            student.setName(sc.next());
            System.out.println("请输入学生" + (i+1) +"的成绩：");
            student.setScore(sc.nextInt());
            treeSet.add(student);
        }
        for(Student student : treeSet){
            oops.writeObject(student);
        }
        oops.close();
        System.out.println("录入成功。");

        System.out.println("学生信息为：");
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("E:\\java实验\\实验7_4_1.txt")));
        for (int i = 0; i < 5; i++) {
            Student student = (Student) ois.readObject();
            System.out.println(student);
        }


    }

}
