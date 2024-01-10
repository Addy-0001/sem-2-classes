/*
 * You are developing a geometry library for a computer-aided design application. 
 * Define an abstract class called Geometry with the following abstract methods. 
 * * The method that computes and returns the surface area of the geometry.
 * * The method that computes and returns the centroid of the geometry.
 * * The method that computes and returns the perimeter of the geometry.
 * 
 * Implement the abstract class and provide concrete implementations for the abstract methods. 
 * Create subclasses for different geometric shapes such as circle and square. 
 * Each subclass should offer specific implementations for the abstract methods. 
 * Instantiate objects of each shape class and demonstrate how you can compute their respective surface area, centroid and perimeters.
 * Formula: 
 * Area of a circle = pi * r^2
 * Area of a square = s^2
 * Perimeter of a circle = 2 * pi * r
 * Perimeter of a square = 4 * s
 * Centroid of a circle = (0, 0)
 * Centroid of a square = (0, 0)
 */

public class Practice {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(5);

        System.out.println("The surface area of the circle is: " + circle.surfaceArea());
        System.out.println("The centroid of the circle is: " + circle.centroid());
        System.out.println("The perimeter of the circle is: " + circle.perimeter());

        System.out.println("The surface area of the square is: " + square.surfaceArea());
        System.out.println("The centroid of the square is: " + square.centroid());
        System.out.println("The perimeter of the square is: " + square.perimeter());
    }
}

abstract class Geometry {
    public abstract double surfaceArea();
    public abstract double centroid();
    public abstract double perimeter();
}

class Circle extends Geometry {
    private double radius;
    private double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return pi * Math.pow(radius, 2);
    }

    public double centroid() {
        return 0;
    }

    public double perimeter() {
        return 2 * pi * radius;
    }
}

class Square extends Geometry {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double surfaceArea() {
        return Math.pow(side, 2);
    }

    public double centroid() {
        return 0;
    }

    public double perimeter() {
        return 4 * side;
    }
}

