package com.kunal.properties.inheritance;

public class Box {
    double length;
    double width;
    double height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box() {
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }

    Box(double length) {
        this.length = length;
        this.width = length;
        this.height = length;
    }

    Box(Box box) {
        this.length = box.length;
        this.width = box.width;
        this.height = box.height;
    }

    public void information() {
        System.out.println("Running the box");
    }


}
