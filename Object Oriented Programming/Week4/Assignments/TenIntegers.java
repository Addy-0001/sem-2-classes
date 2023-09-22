package Week4.Assignments;

import java.util.Scanner;

public class TenIntegers {
    public static void main(String[] args) {
        System.out.println("Enter 10 integer numbers");
        Scanner input = new Scanner(System.in);
        int array[] = new int[20];
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }
        input.close();

        System.out.println("Displaying Contents now.");
        for (int i = 0; i < 10; i++) {
            if (array[i] < 50) {
                System.out.println(array[i] + " is less than 50.");
            } else if (array[i] > 50) {
                System.out.println(array[i] + " is greater than 50.");
            } else {
                System.out.println("That's 50.");
            }
        }
    }
}
