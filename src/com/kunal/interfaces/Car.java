package com.kunal.interfaces;

public class Car implements Brake, Engine{
    @Override
    public void brake() {
        System.out.println("This is normal brake");
    }

    @Override
    public void start() {
        System.out.println("This is normal start");
    }

    @Override
    public void stop() {
        System.out.println("This is normal stop");
    }

    @Override
    public void acc() {
        System.out.println("This is normal acc");
    }
}
