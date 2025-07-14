package com.kunal.packages.a;

public class Person {
    String name;
    int age;

    Person() {
        this("Unknown", 32);
        System.out.println("Default Constructor is called");
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterised Constructor is called");
    }

    public static void main(String[] args) {
        Person ramesh = new Person();
    }
}


