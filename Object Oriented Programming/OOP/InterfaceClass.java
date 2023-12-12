public class InterfaceClass {
    public static void main(String[] args) {

    }
}

interface Animal {
    public void run();

    public String legs(int leg);
}

class Mammal implements Animal {
    @Override
    public void run() {
        System.out.println("The animal is running");
    }

    @Override
    public String legs(int leg) {
        return "legs: " + leg;
    }
}