import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // 4. Write a JAVA program to check whether a number is even or odd.

        // Input section
        Scanner sc = new Scanner(System.in);
        int UserInput = sc.nextInt();
        sc.close();

        if (UserInput % 2 == 0 && UserInput != 0) {
            System.out.println(UserInput + " is even");
        } else if (UserInput % 2 != 0) {
            System.out.println(UserInput + "is odd");
        } else {
            System.out.println("The number is 0");
        }
    }
}
