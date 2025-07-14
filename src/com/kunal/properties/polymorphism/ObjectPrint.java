package com.kunal.properties.polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

//    Overrides the toString() method from the superclass of ObjectPrint
//    which is Object Class which already have an toString() method which is overridden by Run Time Polymorphism
    @Override
    public String toString() {
        return "ObjectPrint [num=" + num + "]";
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(10);
        System.out.println(obj);
    }
}
