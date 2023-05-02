package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework Set and Map");
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Task 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    public static void task2() {
        System.out.println("Task 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> task2 = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                task2.add(num);
            }
        }
        Collections.sort(task2);
        Set<Integer> end = new HashSet<>(task2);
        System.out.print(end);
        System.out.println();
    }
    public static void task3() {
        System.out.println("Task 3");
        List<String> strings = new ArrayList<>(List.of("один", "один", "два","два", "два",
                "три", "три", "три"));
        Set<String> words = new HashSet<>(strings);
        System.out.print(words);
        System.out.println();
    }
    public static void task4() {
        System.out.println("Task 4");
        List<String> strings = new ArrayList<>(List.of("один", "один", "два","два", "два",
                "три", "три", "три"));
        Map<String, Integer> words = new HashMap<>();
        for (String string : strings) {
            if (words.containsKey(string)) {
                words.put(string, words.get(string) + 1);
            } else {
                words.put(string, 1);
            }
        }
        for (String key : words.keySet()) {
            System.out.println("Слово "+ key+" встречается "+ words.get(key)+" раза");
            }

    }
}