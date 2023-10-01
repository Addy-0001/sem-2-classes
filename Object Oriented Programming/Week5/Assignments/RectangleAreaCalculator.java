package Week5.Assignments;

import java.util.Scanner;

public class RectangleAreaCalculator {
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        double area = calculateRectangleArea(length, width);
        System.out.println("Area of the rectangle: " + area);

        input.close();
    }
}
