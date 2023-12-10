public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.display();
    }
}

class Vehicle {
    public void drive() {
        System.out.println("The car is driving now");
    }
}

class Car extends Vehicle {
    int mfd = 1999;
    String type = "Car";

    public void display() {
        System.out.println(this.mfd);
        System.out.println(this.type);
        super.drive();
    }
}