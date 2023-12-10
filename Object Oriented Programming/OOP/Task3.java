public class Task3 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 10);
        rect1.CalculateArea();

        Circle circ1 = new Circle(15);
        circ1.CalculateArea();

        Square squ1 = new Square(10);
        squ1.CalculateArea();
    }
}

class Shape {
    int length;
    int breadth;
    int radius;

    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Shape(int radius) {
        this.radius = radius;
    }

}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void CalculateArea() {
        System.out.println(super.length * super.breadth);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius);
    }

    void CalculateArea() {
        System.out.println(3.14 * super.radius * super.radius);
    }
}

class Square extends Shape {
    Square(int length) {
        super(length, length);
    }

    void CalculateArea() {
        System.out.println(super.length * super.breadth);
    }
}