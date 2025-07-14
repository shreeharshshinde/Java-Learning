package com.kunal.packages.a;

public class Demo {
    static int a;

    static {
        a = 100;
        System.out.println("Static Block Executed");
    }

    void display() {
        System.out.println("The value of a is " + a);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.display();
    }
}
