package com.kunal.properties.inheritance;

public class BoxPrice extends BoxWeight {
    double price;

    BoxPrice() {
        super();
        this.price = 0;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.price = other.price;
    }

    public BoxPrice(double length, double width, double height, double weight, double price) {
        super(length, width, height, weight);
        this.price = price;
    }
}
