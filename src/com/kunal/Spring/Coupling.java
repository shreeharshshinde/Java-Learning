package com.kunal.Spring;

public class Coupling {
    static class Engine {
        void start() {
            System.out.println("The Engine Starts");
        }
    }

    static class Car {
        public Engine engine;

        public Car() {
            this.engine = new Engine();
        }

        public void move() {
            engine.start();
            System.out.println("Car Moves");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.move();
    }
}
