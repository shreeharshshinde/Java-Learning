package com.kunal.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int value) {
        if(isFull()){
            resize();
        }
        data[size++] = value;
    }

    public boolean isFull() {
        return this.size == this.data.length;
    }

    public void resize() {
        int temp[] = new int[data.length * 2];

        for(int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        this.data = temp;
    }

    public int remove() {
        return data[--size];
    }

    @Override
    public String toString() {
        return "CustomArrayList [size=" + size + ", data=" + Arrays.toString(data) + "]";
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove();
        System.out.println(list);
        System.out.println(list.isFull());

    }
}
