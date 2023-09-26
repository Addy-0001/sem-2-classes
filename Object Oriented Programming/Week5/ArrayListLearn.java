package Week5;

import java.util.ArrayList;

public class ArrayListLearn {
    public static void main(String[] args) {
        ArrayList<String> arList1 = new ArrayList<>();
        arList1.add("ABC");
        arList1.add("DEF");

        System.out.println(arList1);

        String firstElement = arList1.get(0);
        String secondElement = arList1.get(1);
        System.out.println(firstElement);
        System.out.println(secondElement);

        arList1.set(0, "This is set using the set method");

        String removeddata = arList1.remove(0);
        System.out.println("The removed data is: " + removeddata);

        arList1.add("DEF");
        arList1.add("DEF");
        arList1.add("DEF");

        // Task
        // Loop through every element of the array
        for (int i = 0; i < arList1.size() - 1; i++) {
            System.out.println("The element at index " + i + " is " + arList1.get(i));
        }

        // Task
        // Make an integer array list, add 5 random numbers and add 10 to 3rd index.
        // Remove the first element and loop the arrat and print the element with
        // multiplication of 2
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            intArray.add(i);
        }
        System.out.println(intArray);

        int element3 = intArray.get(2);
        element3 += 10;

        intArray.set(2, element3);
        intArray.remove(0);
        System.out.println(intArray);

        for (int data : intArray) {
            System.out.println(data * 2);
        }
    }
}
