package org.example.part1_class_types.class_interface;

import org.example.part1_class_types.class_abstract.Dog;

public class Crocodile implements InterfaceAnimal{

    @Override
    public void doSound() {
        System.out.println("Roar din clasa de implementare Crocodile");
    }

    @Override
    public void doSomething() {

    }

    @Override
    public int calculateNumber() {
        return 0;
    }

    @Override
    public String generateText() {
        return "";
    }

    @Override
    public Dog getDog() {
        return null;
    }
}
