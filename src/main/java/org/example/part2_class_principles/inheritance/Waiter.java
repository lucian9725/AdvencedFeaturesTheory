package org.example.part2_class_principles.inheritance;

public class Waiter extends Employee{

    private double tips;

    public Waiter(String id, String name, String surname, int age, double tips) {
        super(id, name, surname, age);
        this.tips = tips;
    }

    @Override
    public void sayHi() {
        System.out.println("Hi, I'm a waiter");
    }
}
