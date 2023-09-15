import java.util.Scanner;

public class Task5 {
    // 5. Write a JAVA program to check whether a year is a leap year or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int UserInput = sc.nextInt();
        sc.close();

        if (UserInput % 4 == 0) {
            System.out.println("The year " + UserInput + " is a leap year");
        } else {
            System.out.println("The year " + UserInput + " is not a leap year");
        }
    }
}
