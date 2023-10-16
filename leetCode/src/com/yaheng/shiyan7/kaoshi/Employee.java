package com.yaheng.shiyan7.kaoshi;

public class Employee {
    private String id;
    private double money;

    public Employee() {
    }

    public Employee(String id, double money) {
        this.id = id;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
