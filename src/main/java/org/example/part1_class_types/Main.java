package org.example.part1_class_types;

import org.example.part1_class_types.class_abstract.AbstractAnimal;
import org.example.part1_class_types.class_abstract.Bird;
import org.example.part1_class_types.class_abstract.Dog;
import org.example.part1_class_types.class_interface.Crocodile;
import org.example.part1_class_types.class_interface.InterfaceAnimal;
import org.example.part1_class_types.class_interface.Parrot;
import org.example.part1_class_types.class_object_concrete.ConcreteAnimal;

public class Main {
    public static void main(String[] args) {
        /*
        Clasa de obiect sau clasa concreta
         */

        //asa se creaza un obiect care pentru constructorul default fara nici un parametru
        ConcreteAnimal concreteAnimalObject1 = new ConcreteAnimal();
        concreteAnimalObject1.setRasa("pisica");
        concreteAnimalObject1.setVarsta(3);
        //asa se creaza un obiect care pentru constructorul cu parametru rasa si varsta
        ConcreteAnimal concreteAnimalObject2 = new ConcreteAnimal("caine", 2);

        //afisam obiectele deoarece avem suprascrisa metoda toString()
        System.out.println("Afisari ale unei clase de obiecte concrete: ");
        System.out.println(concreteAnimalObject1);
        System.out.println(concreteAnimalObject2 + "\n");

        /*
        Abstract class
         // AbstractAnimal abstractAnimalObject = new AbstractAnimal();
         */
        System.out.println("Afisari ale unei clase abstracte: (parent) si a claselor mostenite (sub-clases)");
        Dog dogObject = new Dog();
        dogObject.eat();
        dogObject.makeSound();
        Bird birdObject = new Bird();
        birdObject.eat();
        birdObject.makeSound();
        System.out.println();

        /*
        Interface
         */
        System.out.println("Afisari din interfata si clase de implementare");
        InterfaceAnimal animalObject1 = new Crocodile();
        // e relevant in cazul in care avem o relatie unica de impementare
        // o unica interfata e implementata de o clasa de implementare
        // o clasa de implementare implementeaza o singura interfata unica
        Crocodile crocodileObject = new Crocodile();
        animalObject1.doSound();
        crocodileObject.doSound();

        InterfaceAnimal animalObject2 = new Parrot();
        Parrot parrotObject = new Parrot();
        animalObject2.doSound();
        parrotObject.doSound();



    }
}
