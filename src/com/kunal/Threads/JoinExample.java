package com.kunal.Threads;

public class JoinExample extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " finished!");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted!");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        JoinExample t1 = new JoinExample();

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted while waiting for t1!");
        }


    }
}
