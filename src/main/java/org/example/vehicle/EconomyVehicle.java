package org.example.vehicle;

public class EconomyVehicle extends VehicleAbstract {
    private boolean isHybrid;
    private static final double BASE_PRICE = 50;
    private static final double HYBRID_PRICE = 10;

    public EconomyVehicle(String brand, String model, String licensePlate, boolean isHybrid) {
        super(brand, model, licensePlate);
        this.isHybrid = isHybrid;
    }

    @Override
    public double calculateRentalPrice(int days) {
        double totalPrice = BASE_PRICE * days;
        if (isHybrid) totalPrice += HYBRID_PRICE * days;
        return totalPrice;
    }
}
