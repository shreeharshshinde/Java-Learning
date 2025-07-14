package com.kunal.access;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(32, "Kunal");
        System.out.println(obj.num);

    }
}
