package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println("Task 2");
        List<Integer> task2 = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                task2.add(num);
            }
        }
        Collections.sort(task2);
        Set<Integer> end = new HashSet<>(task2);
        System.out.print(end);
    }
}