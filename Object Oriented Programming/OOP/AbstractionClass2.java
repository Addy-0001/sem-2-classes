public class AbstractionClass2 {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    abstract void eat();

    abstract String legs(int i);

    abstract boolean isFlying(boolean fly);
}

class Mammal extends Animal {
    @Override
    void eat() {
        System.out.println("The animal eats");
    }

    @Override
    String legs(int i) {
        return ("Mammal has " + i + " legs");
    }

    @Override
    boolean isFlying(boolean fly) {
        return fly;
    }
}