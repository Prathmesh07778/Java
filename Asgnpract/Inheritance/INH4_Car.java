package Asgnpract.Inheritance;

class Vehicle {
    String brand;
    String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void showVehicleDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
    }
}

public class INH4_Car extends Vehicle {
    double price;
    String fuelType;

    INH4_Car(String brand, String model, double price, String fuelType) {
        super(brand, model);
        this.price = price;
        this.fuelType = fuelType;
    }

    void showCarDetails() {
        showVehicleDetails();
        System.out.println("Price     : Rs " + price);
        System.out.println("Fuel Type : " + fuelType);
    }

    public static void main(String[] args) {
        INH4_Car car = new INH4_Car("Toyota", "Camry", 1500000, "Petrol");
        car.showCarDetails();
    }
}