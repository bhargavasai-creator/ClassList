package ListExample;  // Package declaration

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList with the specified content
        ArrayList<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("test1");
        list.add("test2");
        list.add("METCS622");
        list.add("BU");
        list.add("Boston University");

        // 1. Iterate through the list and print its content
        System.out.println("List contents:");
        for (String item : list) {
            System.out.println(item);
        }

        // 2. Search for the position of 'BU'
        int positionBU = list.indexOf("BU");
        if (positionBU != -1) {
            System.out.println("\n'BU' is found at position: " + positionBU);
        } else {
            System.out.println("\n'BU' is not found in the list.");
        }

        // 3. Return the index in the list for 'METCS622' and 'test1'
        int positionMETCS622 = list.indexOf("METCS622");
        int positionTest1 = list.indexOf("test1");

        System.out.println("\n'METCS622' is found at position: " + positionMETCS622);
        System.out.println("'test1' is found at position: " + positionTest1);

        // 4. Check if the list contains 'test3'
        boolean containsTest3 = list.contains("test3");
        if (containsTest3) {
            System.out.println("\n'test3' is present in the list.");
        } else {
            System.out.println("\n'test3' is not present in the list.");
        }

        // 5. Remove 'foo' and 'bar' from the list
        list.remove("foo");
        list.remove("bar");

        // Print the updated list
        System.out.println("\nUpdated list after removing 'foo' and 'bar':");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
