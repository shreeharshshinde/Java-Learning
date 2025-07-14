package com.kunal.Threads;

public class InterruptExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        try {
            Thread.sleep(1000);
            t1.interrupt();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
