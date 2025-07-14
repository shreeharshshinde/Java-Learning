package com.kunal.CollectionFramework.Iterations;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();
        list.addItem(1);
        list.addItem(2);
        list.addItem(3);

//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }

        for(int num : list) {
            System.out.println(num + " ");
        }
    }
}
