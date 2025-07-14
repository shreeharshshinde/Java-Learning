package com.kunal.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Square square = new Square();

        circle.area();
    }
}
