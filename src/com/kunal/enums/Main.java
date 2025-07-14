package com.kunal.enums;

public class Main {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        Week() {
            System.out.println("Constructor is called for " + this);
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Sunday;

//        for(Week days : Week.values()){
//            System.out.println(days);
//        }

//        System.out.println(Week.Sunday.ordinal());
    }
}
