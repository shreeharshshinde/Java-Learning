package com.kunal.CollectionFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(2, "Praggnanandha Rameshbabu"));
        list.add(new Student(1, "Gukesh Dommaraju"));
        list.add(new Student(3, "Vidit Gujrathi"));
        list.add(new Student(7, "Divya Deshmukh"));
        list.add(new Student(5, "Arjun Erigasi"));
        list.add(new Student(4, "Vaishali Rameshbabu"));

        Collections.sort(list);

        for(Student s : list) {
            System.out.println(s);
        }

        System.out.println(" ");

        Comparator<Student> comp = (a, b) -> a.getName().compareTo(b.getName());

        Collections.sort(list, comp);

        for(Student s : list) {
            System.out.println(s);
        }

    }
}
