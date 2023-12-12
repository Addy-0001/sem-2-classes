public class AbstractionClassJava {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.sound();
        Dog dog1 = new Dog();
        dog1.sound();
    }
}

abstract class Animal {
    void sound() {

    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("MEOW");
    }
}