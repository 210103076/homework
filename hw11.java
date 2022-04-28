package com.company;
import java.util.*;

public class hw11 {

    public static void main(String[] args) {
        Set<String> s1 = new LinkedHashSet<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        Set<String> s2 = new LinkedHashSet<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

        Set<String> un = new LinkedHashSet<>(s1);
        un.addAll(s2);
        System.out.println("union: " + un);

        Set<String> diff = new LinkedHashSet<>(s1);
        diff.removeAll(s2);
        System.out.println("difference: " + diff);

        Set<String> inter = new LinkedHashSet<>();
        for (String e: s2) {
            if (s1.contains(e))
                inter.add(e);
        }
        System.out.println("intersection: " + inter);
    }
}
