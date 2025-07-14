package com.kunal.Threads;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread is Started");
        Thread thread1 = new Thread1("thread1");
//        thread1.setDaemon(true);
        thread1.start();

        Thread thread2 = new Thread(new Thread2(), "thread2");
        thread2.start();

        System.out.println("Main Thread is Terminated");

        Stack stack = new Stack(5);

        new Thread(()->{
            int counter = 0;
            while(++counter < 10) {
                System.out.println("Pushed:" + stack.push(10));
            }
        }, "Pusher").start();

        new Thread(()->{
            int counter = 0;
            while(++counter < 10) {
                System.out.println("Popped: " + stack.pop());
            }
        }, "Popper").start();


    }
}
