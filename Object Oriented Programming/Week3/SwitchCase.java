import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // All scanning code go here.
        System.out.println("Enter your choice from 1 to 5");
        int userInput = sc.nextInt();
        System.out.println("Enter the first char of your name while you're at it");
        char name = sc.next().charAt(0);
        sc.close();
        // End of scanning code

        // Start of Switch-Case
        switch (userInput) {
            case 1: // Cases and so on. 
                System.out.println(name + " The case input is 1");
                break;
            case 2:
                System.out.println(name + " The Case input is 2");
                break;
            case 3:
                System.out.println(name + " The case input is 3");
                break;
            case 4:
                System.out.println(name + " The Case input is 4");
                break;
            case 5:
                System.out.println(name + " The case input is 5");
                break;
            default:
                // Nested if else statement.
                if (userInput < 0) {
                    System.out.println(name + " you have input negative number");
                } else {
                    System.out.println(name + " You didn't enter a valid value. Try Again.");
                }
                break;
        }
        // End of Switch Case
    }
}