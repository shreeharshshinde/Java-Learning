package com.kunal.CollectionFramework.ArrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        for(int i : arrayList) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        Integer [] arr = arrayList.toArray(new Integer[0]);
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println(" ");

        var name = "Shreeharsh";
        System.out.println(name);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        ListIterator<Integer> iterator = linkedList.listIterator();

        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());


        System.out.println("Element is to be changed is = " + arrayList.set(1, 1000));
        System.out.println(arrayList);

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        while(!stack.empty()) {
            System.out.println(stack.peek());
            stack.pop();
        }

        Queue <Integer> queue = new LinkedList<>();
        queue.offer(11);
        queue.offer(22);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());


        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(44);
        dq.offerFirst(45);
        System.out.println(dq);

        dq.pollLast();
        dq.peekFirst();
        System.out.println(dq);


//        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCustomComparator());
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        pq.offer(10);
        pq.offer(0);
        pq.offer(100);
        System.out.println(pq);

        List<Integer> top2 = new ArrayList<>();
        int index = 0;

        while(!pq.isEmpty()) {
            if(index == 2)
                break;
            top2.add(pq.poll());
            index++;
        }

        System.out.println(top2);
        System.out.println(pq);

        List<StudentMarks> marks = new ArrayList<>();
        marks.add(new StudentMarks(70, 80));
        marks.add(new StudentMarks(38, 10));
        marks.add(new StudentMarks(100, 38));
        marks.add(new StudentMarks(40, 88));
        marks.add(new StudentMarks(97, 19));


        PriorityQueue<StudentMarks> spq = new PriorityQueue<>();

        List<StudentMarks> result = new ArrayList<>();

        int indexOfMarks = 0;
        while(!spq.isEmpty()) {
            if(indexOfMarks == 3)
                break;
            result.add(spq.poll());
            index++;
        }

        System.out.println(spq);
        System.out.println(result);





    }
}
