package Week4.Assignments;

import java.util.Scanner;

public class IntegerReverse {
    public static void main(String[] args) {
        // 8. Write a program that prompts the user to input an integer and then outputs
        // the number with the digits reversed. For example, if the input is 12345, the
        // output should be 54321.
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        input.close();

        String reversed = "";
        int count = userInput.length();
        for (int i = count-1; i >= 0; i--) {
            reversed = reversed + userInput.charAt(i);
        }
        System.out.println(reversed);
    }
}
