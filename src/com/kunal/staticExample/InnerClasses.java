package com.kunal.staticExample;

public class InnerClasses {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Test a = new Test("Shreeharsh");
        Test b = new Test("Aditya");
        Test c = new Test("Om");

        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(c.name);
    }
}
