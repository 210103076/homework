package com.company;
import java.util.*;

public class hw11secondtask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();

        System.out.println("Enter integers: ");

        int key;
        while ((key = in.nextInt()) != 0) {
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                int frequency = map.get(key);
                frequency++;
                map.put(key, frequency);
            }
        }

        int max = Collections.max(map.values());
        System.out.print("Most occurred integers: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }
}