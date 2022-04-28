package com.company;
import java.util.*;

public class hw10secondtask {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5000000; i++) {
            arrayList.add(i);
        }
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);

        long iteratorTimerStart = System.currentTimeMillis();
        ListIterator<Integer> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
        }
        long iteratorTimerEnd = System.currentTimeMillis();

        System.out.println("using an iterator:"
                + (iteratorTimerEnd - iteratorTimerStart) + " millis");

        long getTimerStart = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            linkedList.get(i);
        }
        long getTimerEnd = System.currentTimeMillis();

        System.out.println("using the get(index):"
                + (getTimerEnd - getTimerStart) + " millis");
    }
}
