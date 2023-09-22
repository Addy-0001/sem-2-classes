package Week4.Assignments;

import java.util.Scanner;

public class SumPrinter3 {
    // 10. Write a program that asks the user for a positive nonzero integer value.
    // The program should use a loop to get the sum of all the integers from 1 up to
    // the number entered. For example, if the user enters 50, the loop will find
    // the sum of 1+2+3+4+….+50.
    public static void main(String[] args) {
        System.out.println("Enter a positive integer number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("The sum from 1 to " + number + " is " + sum);
    }
}
