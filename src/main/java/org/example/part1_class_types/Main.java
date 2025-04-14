package org.example.part1_class_types;

import org.example.part1_class_types.class_abstract.AbstractAnimal;
import org.example.part1_class_types.class_abstract.Bird;
import org.example.part1_class_types.class_abstract.Dog;
import org.example.part1_class_types.class_interface.InterfaceAnimal;
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

        /** Clase Anonime**/
            /* Clasa abstracta */
        AbstractAnimal abstractAnimalObject = new AbstractAnimal() {
            @Override
            public void makeSound() {

            }
        };


            /* Interfata */
        InterfaceAnimal interfaceAnimalObject = () -> {

        };
    }
}
