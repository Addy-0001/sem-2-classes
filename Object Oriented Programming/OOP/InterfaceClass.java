public class InterfaceClass {
    public static void main(String[] args) {
        Mammal m = new Mammal();
        System.out.println(m.name);
        m.run();
        System.out.println(m.legs(4));
    }
}

interface Animal {
    String name = "cow";
    public void run();

    public String legs(int leg);
}

class Mammal implements Animal {
    
    String name = "not cow";

    @Override
    public void run() {
        System.out.println("The animal is running");
    }

    @Override
    public String legs(int leg) {
        return "legs: " + leg;
    }
}