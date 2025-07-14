package com.kunal.objectCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(32, "Kunal Kushwaha");
        Human twin = (Human) kunal.clone();
        System.out.println(twin.age);
    }
}
