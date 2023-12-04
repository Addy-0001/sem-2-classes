public class ClassWork {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.Meow();
        System.out.println(cat1.type);

        Dog dog1 = new Dog();
        dog1.Bark();
        System.out.println(dog1.type);
    }
}

class Animal {
    String type = "Domestic";
}

class Dog extends Animal {
    String category = "Dog";

    void Bark() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    String category = "Cat";

    void Meow() {
        System.out.println("Meow");
    }
}