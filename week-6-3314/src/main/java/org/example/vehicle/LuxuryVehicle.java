package org.example.vehicle;

public class LuxuryVehicle extends VehicleAbstract {
    private boolean hasGPS;
    private boolean hasLeatherSeats;
    private static final double BASE_PRICE = 100;
    private static final double GPS_PRICE = 20;
    private static final double LEATHER_SEATS_PRICE = 30;

    public LuxuryVehicle(String brand, String model, String licensePlate, boolean hasGPS, boolean hasLeatherSeats) {
        super(brand, model, licensePlate);
        this.hasGPS = hasGPS;
        this.hasLeatherSeats = hasLeatherSeats;
    }

    @Override
    public double calculateRentalPrice(int days) {
        double totalPrice = BASE_PRICE * days;
        if (hasGPS) totalPrice += GPS_PRICE * days;
        if (hasLeatherSeats) totalPrice += LEATHER_SEATS_PRICE * days;
        return totalPrice;
    }
}
