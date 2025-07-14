package com.kunal.CollectionFramework.Iterations;

import java.util.Iterator;

public class OurGenericList<T> implements Iterable<T> {

    private T[] items;
    private int size;

    public OurGenericList() {
        size = 0;
        items = (T[]) new Object[100];
    }

    public void addItem(T item) {
        items[size++] = item;
    }

    public T getItemAtIndex(int index) {
        if(index >= size){
            throw new IndexOutOfBoundsException("Index is Out of Range");
        }
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new OurGenericListIterator<T>(this);
    }

    private class OurGenericListIterator<T> implements Iterator<T> {
        private OurGenericList<T> list;
        private int index = 0;

        public OurGenericListIterator(OurGenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            System.out.println("hasNext() is called");
            return index < size;
        }

        @Override
        public T next() {
            System.out.println("next() is called");
            return list.items[index++];
        }
    }



}
