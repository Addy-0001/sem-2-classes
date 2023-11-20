import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // 2. Write a JAVA program to check whether a number is negative, positive, or
        // zero.

        // Inputs
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        // End of inputs

        // checking
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number == 0) {
            System.out.println("The number is equal to 0");
        } else {
            System.out.println("The number is negative");
        }

    }
}
