package de.easyride.obj;

public class Vehicle {
    public Vehicle(int i, String model) {
        this.vehicleId = i;
        this.model = model;

    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    private int vehicleId;
    private String model;
    // ... other properties and methods
}
