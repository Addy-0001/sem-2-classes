package Week4;

import java.util.Scanner;

public class EvenorOdd {
    static String Check(int number) {
        if (number % 2 == 0) {
            return ("Even");
        } else {
            return ("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        input.close();
        Check(number);
    }
}
