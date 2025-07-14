package com.kunal.Threads;

import javax.swing.plaf.TableHeaderUI;

public class Stack {
    private int[] array;
    private int stackTop;
    Object lock;

    public Stack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
        lock = new Object();
    }

    public boolean isFull() {
        return stackTop >= array.length;
    }

    public boolean isEmpty() {
        return stackTop < 0;
    }

//    t1, t2, t4
    public boolean push(int element) {
        synchronized (lock) {
            if(isFull()) return false;
            ++ stackTop;

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

            array[stackTop] = element;
            return true;
        }
    }

//    t1, t3, t5
    public int pop() {
        synchronized (lock) {
            if(isEmpty()) return Integer.MIN_VALUE;
            int obj = array[stackTop];
            array[stackTop] = Integer.MIN_VALUE;

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

            stackTop --;
            return obj;
        }
    }
}
