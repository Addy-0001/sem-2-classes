package Week2;

public class Task {
    // Task 2 - To calculate Simple Interest
    public static void calculateSI(double principleAmount, double time, double rate) {
        double simpleInterest = (principleAmount * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }

    // Task 3 - To calculate area of triangle
    public static void calculateAreaOfTriangle(double base, double height) {
        double areaOfTriangle = (base * height) / 2;
        System.out.println("Area of Triangle: " + areaOfTriangle);
    }

    // Task 3. To calculate volume of cube
    public static void calculateVolumeOfCube(double side) {
        double volumeOfCube = side * side * side;
        System.out.println("Volume of Cube: " + volumeOfCube);
    }

    // Task 3. To calculate volume of cuboid
    public static void calculateVolumeOfCuboid(double length, double width, double height) {
        double volumeOfCuboid = length * width * height;
        System.out.println("Volume of Cuboid: " + volumeOfCuboid);
    }

    // Task 4 and task 1 - Ternary operator for Task 1
    public static void ternaryOperatorForTask1(int age) {
        String result = (age >= 18) ? "You can cast your vote." : "You cannot cast your vote.";
        System.out.println(result);
    }

    // Task 5 - To take two integer inputs from the user and print the sum and
    // product of them.
    public static void sumAndProductOfTwoIntegers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        int product = firstNumber * secondNumber;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }

    // Task 6 - To take two integer inputs from the user. First, calculate the sum
    // of
    // two, then the product of two. Finally, calculate the division of the thus
    // obtained sum and product and print the result.
    public static void sumProductAndDivisionOfTwoIntegers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        int product = firstNumber * secondNumber;
        double division = (double) sum / product;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);
    }

    // Task 7 - To take the name, roll number, and field of interest from the user
    // and print in the format below: Hey, my name is XYZ and my roll number is XYZ.
    // My field of interest are xyz.
    public static void printNameRollNumberAndFieldOfInterest(String name, int rollNumber, String fieldOfInterest) {
        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber
                + ". My field of interest are " + fieldOfInterest + ".");
    }

    // Task 8 - To take side of a square from user and print area and perimeter of
    // it. Also, calculate Simple Interest, Area of triangle and Volume of Cube and
    // Cuboid. Take the attributes as user input.
    public static void calculateAreaAndPerimeterOfSquare(double side) {
        double area = side * side;
        double perimeter = 4 * side;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    // Task 9 - To ask user to give two double input for length and breadth of a
    // rectangle and print area type casted to int.
    public static void calculateAreaOfRectangle(double length, double breadth) {
        double area = length * breadth;
        int areaInInt = (int) area;
        System.out.println("Area: " + areaInInt);
    }

    // Task 10 - To calculate the total marks of four subjects of a student and the
    // total percentage secured. And use the following conditions to generate the
    // final result;
    // a. If equal to or more than 70 -> First Class
    // b. If more than 59 -> Upper Second Class
    // c. If more than 49 -> Second class
    // d. If more than 39 -> Third class and if below than 40 the result is fail.
    // Hint: Use ternary operator
    public static void calculateTotalMarksAndPercentage(int subject1, int subject2, int subject3, int subject4) {
        int totalMarks = subject1 + subject2 + subject3 + subject4;
        double percentage = (double) totalMarks / 4;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        String result = (percentage >= 70) ? "First Class"
                : (percentage > 59) ? "Upper Second Class"
                        : (percentage > 49) ? "Second Class" : (percentage > 39) ? "Third Class" : "Fail";
        System.out.println("Result: " + result);
    }
}
