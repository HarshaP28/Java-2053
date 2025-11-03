package LabPractise8;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of Integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.addFirst(5);   // add at beginning
        numbers.addLast(40);   // add at end

        // Display all elements
        System.out.println("LinkedList elements: " + numbers);

        // Remove first and last
        numbers.removeFirst();
        numbers.removeLast();

        // Display updated list
        System.out.println("After removing first & last: " + numbers);

        // Access by index
        System.out.println("Element at index 1: " + numbers.get(1));

        // Iterate through LinkedList
        System.out.println("Iterating through LinkedList:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}

