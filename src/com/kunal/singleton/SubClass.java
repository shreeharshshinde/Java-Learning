package com.kunal.singleton;

import com.kunal.access.A;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(32, "Kunal");
        System.out.println(obj.num);

    }
}
