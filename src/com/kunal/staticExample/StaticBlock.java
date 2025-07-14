package com.kunal.staticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        System.out.println("I am inside of static block");
        b = a * 5;
    }

    public static void main(String[] args) {
//      Actually there was no need of creating objects each time as data is static and directly accessed by Classnames;
        StaticBlock a = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock b = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock c = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}
