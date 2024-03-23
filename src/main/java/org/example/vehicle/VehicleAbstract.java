package org.example.vehicle;
public abstract class VehicleAbstract {
    public String brand;
    public String model;
    public String licensePlate;

    public VehicleAbstract(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public abstract double calculateRentalPrice(int days);
}
