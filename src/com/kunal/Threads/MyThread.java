package com.kunal.Threads;

public class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread going to Sleep");
            Thread.sleep(5000);
            System.out.println("Thread Woke up Naturally");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

