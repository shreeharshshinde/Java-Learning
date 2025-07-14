package com.kunal.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda {

//    @Override
//    public String toString() {
//        return
//    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();



        for(int i = 0; i < 10; i++) {
            list.add(i+1);
        }

        Runnable runnable = () -> System.out.println(list.toString());

        Consumer<Integer> consumer = (value) -> System.out.println(value * 2);
//        consumer.accept(10);
        list.forEach(consumer);
    }
}
