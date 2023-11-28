package L04_CollectionClasses;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList to store strings
        LinkedList<String> names = new LinkedList<>();

        // Adding elements to the LinkedList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Accessing elements in the LinkedList
        System.out.println("Elements in the LinkedList: " + names);

        // Accessing a specific element by index
        String secondName = names.get(1);
        System.out.println("Second name in the LinkedList: " + secondName);

        // Updating an element at a specific index
        names.set(0, "Alex");
        System.out.println("Updated LinkedList: " + names);

        // Removing an element by value
        names.remove("Bob");
        System.out.println("LinkedList after removing Bob: " + names);

        // Checking if an element exists in the LinkedList
        boolean containsAlice = names.contains("Alice");
        System.out.println("LinkedList contains Alice: " + containsAlice);

        // Getting the size of the LinkedList
        int size = names.size();
        System.out.println("Size of the LinkedList: " + size);

        // Iterating through the LinkedList using a for-each loop
        System.out.println("Iterating through the LinkedList:");
        for (String name : names) {
            System.out.print(name + " ");
        }

        // Clearing the LinkedList
        names.clear();
        System.out.println("\nLinkedList after clearing: " + names);
    }
}
