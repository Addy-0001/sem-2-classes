public class AbstractionClassTask {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        bike1.Drive();
        System.out.println(bike1.Stop(true));
        System.out.println(bike1.changeGear(5));
    }
}

abstract class Vehicle {
    abstract void Drive();

    abstract String changeGear(int gear);

    abstract boolean Stop(boolean stop);
}

class Bike extends Vehicle {
    @Override
    void Drive() {
        System.out.println("Driving");
    }

    @Override
    String changeGear(int gear) {
        return "The gear has been changed to " + gear;
    }

    @Override
    boolean Stop(boolean stop) {
        return stop;
    }

}