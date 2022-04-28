package com.company;

import java.io.*;
import java.util.PriorityQueue;

public class hw10 {

    public static void main(String[] args) throws Exception {
        File file = new File("/Users/macbook/Desktop/uni/spring2022/hw10/src/com/company/hw10text.txt");

        if (!file.isFile())
            throw new FileNotFoundException(file.getName() + " is not a file");

        PriorityQueue<String> pQueue = new PriorityQueue<>(1000, String.CASE_INSENSITIVE_ORDER);

        try (BufferedReader in = new BufferedReader(new FileReader(file))) {

            String s;
            while ((s = in.readLine()) != null) {

                String[] words = getValidWords(s);
                for (String word : words) {
                    pQueue.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        }

        while (pQueue.size() > 0) {
            System.out.println(pQueue.poll() );
        }

    }

    public static String[] getValidWords(String s) {
        s = s.replaceAll("[0-9]\\p{L}+", "");
        s = s.replaceAll("\\s+", " ");
        return s.split(" ");
    }

}