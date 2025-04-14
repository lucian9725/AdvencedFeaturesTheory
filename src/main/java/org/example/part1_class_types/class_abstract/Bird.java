package org.example.part1_class_types.class_abstract;

public class Bird extends AbstractAnimal {
    @Override
    public void makeSound() {
        System.out.println("Chip cirip din sub-clasa Bird!");
    }
}