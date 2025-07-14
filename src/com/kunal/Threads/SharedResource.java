package com.kunal.Threads;

public class SharedResource {
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (!flag) {
                // Loop might be optimized to never re-read `flag`
            }
            System.out.println("Flag changed!");
        });

        Thread t2 = new Thread(() -> {
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            flag = true;
        });

        t1.start();
        t2.start();
    }
}
