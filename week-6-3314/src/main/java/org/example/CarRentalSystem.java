package org.example;

import org.example.vehicle.EconomyVehicle;
import org.example.vehicle.LuxuryVehicle;
import org.example.vehicle.VehicleAbstract;

import java.util.ArrayList;
import java.util.List;

public class CarRentalSystem {
    public static void main(String[] args) {
        VehicleAbstract luxuryCar = new LuxuryVehicle("Mercedes", "S-Class", "ABC123", true, true);
        VehicleAbstract economyCar = new EconomyVehicle("Toyota", "Corolla", "XYZ456", true);

        int rentalPeriod = 5;
        double luxuryCarPrice = luxuryCar.calculateRentalPrice(rentalPeriod);
        double economyCarPrice = economyCar.calculateRentalPrice(rentalPeriod);

        RentalRecord luxuryRentalRecord = new RentalRecord(luxuryCar, rentalPeriod, luxuryCarPrice, "John Doe");
        RentalRecord economyRentalRecord = new RentalRecord(economyCar, rentalPeriod, economyCarPrice, "Jane Smith");

        List<RentalRecord> rentalRecords = new ArrayList<>();
        rentalRecords.add(luxuryRentalRecord);
        rentalRecords.add(economyRentalRecord);

        for (RentalRecord record : rentalRecords) {
            System.out.println("Lessor: " + record.getLessorIdentity());
            System.out.println("Vehicle: " + record.getVehicle().brand + " " + record.getVehicle().model);
            System.out.println("License Plate: " + record.getVehicle().licensePlate);
            System.out.println("Rental Period: " + record.getRentalPeriodInDays() + " days");
            System.out.println("Rental Price: $" + record.getRentalPrice());
            System.out.println();
        }
    }
}