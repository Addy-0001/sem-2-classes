package Week4.Assignments;

import java.util.Scanner;

public class Pattern1 {

    // Write a program that reads the width and generates a corresponding square of
    // *. For example, if width = 5, output is:

    // *****

    // *****

    // *****

    // *****

    // *****

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Width");
        int width = input.nextInt();
        input.close();

        for (int j = 0; j < width; j++) {
            for (int i = 0; i < width; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
