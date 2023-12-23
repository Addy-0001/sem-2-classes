import java.util.Scanner;

public class VehichleCW {
    public static void main(String[] args) {
        // create 3 objects of the class

        // Vehicle 1
        // Taking various inputs from the user

        Vehicle[] empty_vehicles = new Vehicle[3];
        String title = "";
        String manufacturer = "";
        double price = 0;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the title of the vehicle");
        title = sc.nextLine();
        System.out.println("Enter the manufacturer of the vehicle");
        manufacturer = sc.nextLine();
        System.out.println("Enter the price of the vehicle");
        price = sc.nextDouble();

        Vehicle vehicle1 = new Vehicle(title, manufacturer, price);

        // Vehicle 2
        // Taking various inputs from the user

        System.out.println("Enter the title of the vehicle");
        title = sc.nextLine();
        System.out.println("Enter the manufacturer of the vehicle");
        manufacturer = sc.nextLine();
        System.out.println("Enter the price of the vehicle");
        price = sc.nextDouble();

        Vehicle vehicle2 = new Vehicle(title, manufacturer, price);

        // Vehicle 3
        // Taking various inputs from the user

        System.out.println("Enter the title of the vehicle");
        title = sc.nextLine();
        System.out.println("Enter the manufacturer of the vehicle");
        manufacturer = sc.nextLine();
        System.out.println("Enter the price of the vehicle");
        price = sc.nextDouble();

        Vehicle vehicle3 = new Vehicle(title, manufacturer, price);
        sc.close();

        // Create an array of the objects and loop through them to find the vehicle with
        // maximum
        // price and display the objects detail with max price
        Vehicle[] vehicles = { vehicle1, vehicle2, vehicle3 };
        double maxPrice = 0;
        Vehicle maxPriceVehicle = null;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPrice() > maxPrice) {
                maxPrice = vehicle.getPrice();
                maxPriceVehicle = vehicle;
            }
        }
        System.out.println("The vehicle with the maximum price is " + maxPriceVehicle.getTitle() + " with the price of "
                + maxPriceVehicle.getPrice() + " and the manufacturer is " + maxPriceVehicle.getManufacturer());
    }
}

class Vehicle {
    private String title;
    private String manufacturer;
    private double price;

    public Vehicle(String title, String manufacturer, double price) {
        this.title = title;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    // Make getter of all the private properties
    public String getTitle() {
        return this.title;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public double getPrice() {
        return this.price;
    }
}