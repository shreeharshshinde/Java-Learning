package com.kunal.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
//        car.brake();
//        car.start();
//        car.stop();
//
//        CDPlayer cdPlayer = new CDPlayer();
//        cdPlayer.stop();

        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.startMusic();
        niceCar.stop();
        niceCar.upgradeEngine();
        niceCar.start();

    }
}
