import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or
        // not.

        // Input section
        Scanner sc = new Scanner(System.in);
        int UserInput = sc.nextInt();
        sc.close();

        if (UserInput % 5 == 0 && UserInput % 11 == 0) {
            System.out.println(UserInput + " is divisible by 5 as well as 11");
        } else {
            System.out.println(UserInput + "is not divisible by 5 and 11");
        }
    }
}
