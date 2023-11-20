import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // Write a Java program that takes a student's grade as input (A, B, C, D, or F)
        // and converts it to the corresponding GPA value. Use a switch case statement
        // to handle different grades.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade - A, B, C, D, E, or F.");
        char UserInput = sc.next().charAt(0);
        sc.close();

        switch (UserInput) {
            case 'a':
            case 'A':
                System.out.println("The CGPA is 3.2 - 4.0");
                break;
            case 'b':
            case 'B':
                System.out.println("The CGPA is 3.2 - 2.4");
                break;
            case 'c':
            case 'C':
                System.out.println("The CGPA is 2.4 - 1.6");
                break;
            case 'd':
            case 'D':
                System.out.println("The CGPA is 1.6 - 0.8");
                break;
            case 'e':
            case 'E':
                System.out.println("The CGPA is 0.8- 0.4");
                break;
            case 'f':
            case 'F':
                System.out.println("The CGPA is 0 - 0.4");
                break;
        }
    }
}
