public class OOPFirst {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.first_name = "Adamya";
        p1.last_name = "Neupane";
        p1.age = 22;
        p1.location = "Kaushaltar";

        p1.description(args);
        p1.ageCalculator();
    }
}

class Person {
    String first_name;
    String last_name;
    int age;
    String location;

    void description(String[] args) {
        System.out.println("Hi, my name is: " + first_name + " " + last_name);
        System.out.println("I live in: " + location);
    }

    void ageCalculator() {
        if (age > 18) {
            System.out.println("Good");
        } else {
            System.out.println("Underage");
        }
    }
}
