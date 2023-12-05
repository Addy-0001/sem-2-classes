public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1.tag);
        System.out.println(d1.subtag);
        System.out.println(d1.type);
        d1.display();
        d1.act();
        d1.bark();
    }
}

class Person {
    String name = "Person";

    void display() {
        System.out.println("Default Name : " + this.name);
    }
}

class Male extends Person {
    int life = 60;

    void live() {
        System.out.println("Lives: " + this.life);
    }
}

class Female extends Person {
    int life = 70;

    void live() {
        System.out.println("Lives: " + this.life);
    }
}

class Animal {
    String tag = "Animal";

    void display() {
        System.out.println("Living Creature");
    }
}

class Mammal extends Animal {
    String subtag = "mammal";

    void act() {
        System.out.println("NO Lay eggs");
    }
}

class Dog extends Mammal {
    String type = "Dog";

    void bark() {
        System.out.println("BARK");
    }
}