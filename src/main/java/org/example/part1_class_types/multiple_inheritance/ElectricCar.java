package org.example.part1_class_types.multiple_inheritance;

public class ElectricCar extends GenericVehicle implements ElectricSystem, NavigationSystem{

    private int batteryLevel;
    private double range;

    public ElectricCar(String brand,
                       String model,
                       int yearOfFabrication,
                       int batteryLevel,
                       double range)
    {
        super( brand,  model,  yearOfFabrication);
        this.batteryLevel = batteryLevel;
        this.range = range;

    }
    @Override
    public void chargeBattery() {

        System.out.println("Battery charged to " + this.batteryLevel);
    }

    @Override
    void drive() {
        System.out.println(this.brand + " " + this.model + " is driving silently...");
    }

    @Override
    public void navigateTo(String destination) {
        System.out.println("Navigating to " + destination + " using GPS...");
    }

    public void displayStatus () {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Year of Fabrication: " + this.yearOfFabrication);
        System.out.println("Battery Level: " + this.batteryLevel);
        System.out.println("Range: " + this.range);
    }

    //todo: creati inca doua clase DieselCar si HybridCar care sa extinda GenericVehicle
}
