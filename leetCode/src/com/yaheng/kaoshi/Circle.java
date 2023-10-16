package com.yaheng.kaoshi;

public class Circle extends Figure{
    private String r;

    public Circle(String name, String type, String r) {
        super(name, type);
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ",r='" + r + '\'' +
                '}' ;
    }
}
