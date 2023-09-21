package Week4;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // First Problem
        int count = 0;
        while (true) {
            count += 1;
            if (count > 5) {
                break;
            }
            System.out.println(count);
        }
        // Second Program
        Scanner input = new Scanner(System.in);
        int result = input.nextInt();

        while (result < 10 && result > 100) {
            System.out.println("Invalid Input");
            result = input.nextInt();
        }

        System.out.println("Valid input");
        input.close();

        // Table of 2
        int mult = 2;
        int increment = 1;

        while (true) {
            System.out.println(mult + " * " + increment + " = " + mult * increment);
            increment += 1;
            if (increment == 11) {
                break;
            }
        }

        // Table of 3 in reverse
        mult = 3;
        increment = 10;
        while (true) {
            System.out.println(mult + " * " + increment + " = " + mult * increment);
            increment -= 1;
            if (increment < 1) {
                break;
            }
        }
        // Nested Loop
        int outer = 0;
        while (outer < 5) {
            int inner = 0;
            System.out.println("Outer" + outer);
            while (inner < 5) {
                System.out.print("Inner: " + inner + " ");
                inner++;
            }
            System.out.println(" ");
            outer++;
        }
        // Loop to 10 and print only if the value is even using continue and without
        // else.
        count = 1;
        while (count < 10) {
            if (count % 2 == 0) {
                System.out.println("Even");
                count++;
                continue;
            }
            System.out.println("odd");
            count++;
        }
        // Take input from the user and using while, reak the loop only when the input
        // is between 30 and 50.
        Scanner userinp = new Scanner(System.in);

        while (true) {
            int number = userinp.nextInt();
            if (number > 29 && number < 51) {
                break;
            }
        }
        userinp.close();

    }
}
