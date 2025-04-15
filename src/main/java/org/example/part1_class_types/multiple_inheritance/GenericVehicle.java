package org.example.part1_class_types.multiple_inheritance;

public abstract class GenericVehicle {

    protected String brand;
    protected String model;
    protected int yearOfFabrication;

    public GenericVehicle(String brand, String model, int yearOfFabrication) {
        this.brand = brand;
        this.model = model;
        this.yearOfFabrication = yearOfFabrication;
    }

    void startEngine() {
        System.out.println(this.brand + " " + this.model + " is starting the engine...");
    }

    abstract void drive();
}
