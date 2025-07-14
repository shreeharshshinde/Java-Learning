package com.kunal.staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22, "Kunal Kale", 10000, false);
        Human ritesh = new Human(22, "Ritesh Khandagale", 10000, true);
        Human arpit = new Human(22, "Arpit Bala", 10000, true);

        System.out.println(Human.population);

        fun();

    }

    static void fun() {
        Main obj = new Main();
        obj.greeting();
    }

    void greeting() {
        System.out.println("Hello World");
    }
}
