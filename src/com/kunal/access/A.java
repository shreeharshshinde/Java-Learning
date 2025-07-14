package com.kunal.access;

public class A {
    protected int num;
    String name;
    int[] arr;

//    Getter for accessing private num
    public int getNum() {
        return num;
    }

//    Setter for setting private num;
    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
