public class Aavash {
    public static void main(String[] args) {
    }
}

abstract class ElectronicDevice {
    abstract String getBrand();

    abstract String getModel();

    abstract int getYear();

    abstract boolean isTurnedOn();
}

class Smartphone extends ElectronicDevice {
    private String brand;
    private String model;
    private int year;
    private boolean turnedOn;

    public Smartphone(String brand, String model, int year, boolean turnedOn) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.turnedOn = turnedOn;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getYear() {
        return this.year;
    }

    @Override
    public boolean isTurnedOn() {
        return this.turnedOn;
    }
}