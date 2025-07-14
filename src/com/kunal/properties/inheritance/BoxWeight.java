package com.kunal.properties.inheritance;

import java.security.PublicKey;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        super();
        this.weight = 0;
    }

    public BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }
}
