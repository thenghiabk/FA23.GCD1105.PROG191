package L04_CollectionClasses;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Accessing elements in the ArrayList
        System.out.println("Elements in the ArrayList: " + numbers);

        // Accessing a specific element by index
        int thirdElement = numbers.get(2);
        System.out.println("Third element in the ArrayList: " + thirdElement);

        // Updating an element at a specific index
        numbers.set(1, 25);
        System.out.println("Updated ArrayList: " + numbers);

        // Removing an element by value
        numbers.remove(Integer.valueOf(30));
        System.out.println("ArrayList after removing 30: " + numbers);

        // Checking if an element exists in the ArrayList
        boolean contains20 = numbers.contains(20);
        System.out.println("ArrayList contains 20: " + contains20);

        // Getting the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of the ArrayList: " + size);

        // Iterating through the ArrayList using a for-each loop
        System.out.println("Iterating through the ArrayList:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Clearing the ArrayList
        numbers.clear();
        System.out.println("\nArrayList after clearing: " + numbers);
    }
}

















