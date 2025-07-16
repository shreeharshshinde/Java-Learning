package com.kunal.objectCloning;

    public class Car {
        String model;
        int year;

        // Constructor 1
        Car() {
            this("Tesla", 2024); // Constructor chaining to Constructor 2
            System.out.println("Default constructor called");
        }

        // Constructor 2
        Car(String model, int year) {
            this.model = model;
            this.year = year;
            System.out.println("Parameterized constructor called");
        }
    }


