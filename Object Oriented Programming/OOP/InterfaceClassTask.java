public class InterfaceClassTask {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        bike1.Drive();
        System.out.println(bike1.Stop(true));
        System.out.println(bike1.changeGear(5));
    }

}

interface Vehicle {
    public void Drive();

    public String changeGear(int gear);

    public boolean Stop(boolean stop);
}

class Bike implements Vehicle {
    @Override
    public void Drive() {
        System.out.println("Driving");
    }

    @Override
    public String changeGear(int gear) {
        return "The gear has been changed to " + gear;
    }

    @Override
    public boolean Stop(boolean stop) {
        return stop;
    }

}