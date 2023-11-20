import java.util.Scanner;

public class Task10 {
    public void SquaredArea(double side) {
        double area = Math.pow(side, 2);
        System.out.println("The area of the circle is: " + area);
    }

    public void MultipliedArea(double side1, double side2, double constant) {
        double area = side1 * side2 * constant;
        System.out.println("The area is : " + area);
    }

    public static void main(String[] args) {
        // 4. Implement a Java program that calculates the area of different shapes
        // (circle, rectangle, square, triangle) based on the user's choice using a
        // switch case.

        System.out.println("Input 1 for Circle");
        System.out.println("Input 2 for Rectangle");
        System.out.println("Input 3 for Square");
        System.out.println("Input 4 for Triangle");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Task10 caller = new Task10();

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle");
                double radius = sc.nextDouble();
                caller.SquaredArea(radius);
                break;
            case 2:
                System.out.println("Enter the length of rectangle");
                double length = sc.nextDouble();
                System.out.println("Enter the breadth of the rectangle");
                double breadth = sc.nextDouble();
                double constant = 1.0;
                caller.MultipliedArea(length, breadth, constant);
                break;
            case 3:
                System.out.println("Enter the Length of the Square");
                double square_length = sc.nextDouble();
                caller.SquaredArea(square_length);
                break;
            case 4:
                System.out.println("Enter the base length of triangle");
                double base = sc.nextDouble();
                System.out.println("Enter the height of the triangle");
                double height = sc.nextDouble();
                double tri_constant = 0.5;
                caller.MultipliedArea(base, height, tri_constant);
                break;
            default:
                System.out.println("Error, please input a valid selector.");
                break;
        }

        sc.close();
    }
}
