package com.yaheng.kaoshi;

public class Test {
    public static void main(String[] args) {
        Figure figure = new Figure("图一","长方形");
        Figure circle = new Circle("图二","圆","10厘米");

        figure.introduce();
        System.out.println(circle.toString());
    }
}
