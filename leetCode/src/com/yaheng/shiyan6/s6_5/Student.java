package com.yaheng.shiyan6.s6_5;

public class Student implements Comparable {
    private String name;
    private int score;

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}' + "\n";
    }


    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        if (this.score - student.score > 0)
            return -1;
        if (this.score - student.score == 0)
            return this.name.compareTo(student.name);
        return 1;
    }
}
