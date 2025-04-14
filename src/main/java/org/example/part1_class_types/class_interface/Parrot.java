package org.example.part1_class_types.class_interface;

import org.example.part1_class_types.class_abstract.Dog;

public class Parrot implements InterfaceAnimal{

    @Override
    public void doSound() {
        System.out.println("Cip cirip din clasa de implementare Parrot");
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
