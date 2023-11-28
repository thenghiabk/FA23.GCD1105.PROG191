package L04_CollectionClasses;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap to store integer keys and string values
        TreeMap<Integer, String> studentGrades = new TreeMap<>();

        // Adding elements to the TreeMap
        studentGrades.put(101, "A");
        studentGrades.put(102, "B");
        studentGrades.put(105, "C");
        studentGrades.put(103, "A+");
        studentGrades.put(104, "B-");

        // Accessing elements in the TreeMap
        System.out.println("Student Grades: " + studentGrades);

        // Accessing a value by key
        String grade101 = studentGrades.get(101);
        System.out.println("Grade for student 101: " + grade101);

        // Checking if a key exists in the TreeMap
        boolean containsKey105 = studentGrades.containsKey(105);
        System.out.println("Contains key 105: " + containsKey105);

        // Checking if a value exists in the TreeMap
        boolean containsValueB = studentGrades.containsValue("B");
        System.out.println("Contains value 'B': " + containsValueB);

        // Getting the size of the TreeMap
        int size = studentGrades.size();
        System.out.println("Size of the TreeMap: " + size);

        // Removing an entry by key
        studentGrades.remove(103);
        System.out.println("TreeMap after removing key 103: " + studentGrades);

        // Getting the first and last entry in the TreeMap
        System.out.println("First Entry: " + studentGrades.firstEntry());
        System.out.println("Last Entry: " + studentGrades.lastEntry());

        // Clearing the TreeMap
        studentGrades.clear();
        System.out.println("TreeMap after clearing: " + studentGrades);
    }
}
