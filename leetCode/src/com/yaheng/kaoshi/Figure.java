package com.yaheng.kaoshi;

public class Figure {
    private String name;
    private String type;

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void introduce(){
        System.out.println(this.toString());
    }

    public Figure(String name) {
        this.name = name;
    }

    public Figure(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
