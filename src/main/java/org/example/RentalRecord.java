package org.example;

import org.example.vehicle.VehicleAbstract;

public class RentalRecord {
    private VehicleAbstract vehicle;
    private int rentalPeriodInDays;
    private double rentalPrice;
    private String lessorIdentity;

    public RentalRecord(VehicleAbstract vehicle, int rentalPeriodInDays, double rentalPrice, String lessorIdentity) {
        this.vehicle = vehicle;
        this.rentalPeriodInDays = rentalPeriodInDays;
        this.rentalPrice = rentalPrice;
        this.lessorIdentity = lessorIdentity;
    }

    // Getters and setters
    public VehicleAbstract getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleAbstract vehicle) {
        this.vehicle = vehicle;
    }

    public int getRentalPeriodInDays() {
        return rentalPeriodInDays;
    }

    public void setRentalPeriodInDays(int rentalPeriodInDays) {
        this.rentalPeriodInDays = rentalPeriodInDays;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public String getLessorIdentity() {
        return lessorIdentity;
    }

    public void setLessorIdentity(String lessorIdentity) {
        this.lessorIdentity = lessorIdentity;
    }
}