package com.kunal.interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("CDPlayer start");
    }

    @Override
    public void stop() {
        System.out.println("CDPlayer stop");
    }
}
