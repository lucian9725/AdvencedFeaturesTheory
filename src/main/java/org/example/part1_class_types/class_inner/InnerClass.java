package org.example.part1_class_types.class_inner;

import org.example.part1_class_types.class_abstract.AbstractAnimal;
import org.example.part1_class_types.class_abstract.Dog;
import org.example.part1_class_types.class_interface.InterfaceAnimal;

public class InnerClass {

    /* Static nested Class */
    static class StaticNestedClassExample {
        //putem avea atribute, constructori, alte metode, getters/setters, orice metoda de supra-scriere

        void diplay() {
            System.out.println("Salutare din interiorul unei clase statice interna!");
        }

    }

    /* Non-static nested Class */
    class NonStaticNestedClassExample {
        //putem avea atribute, constructori, alte metode, getters/setters, orice metoda de supra-scriere

        void diplay() {
            System.out.println("Salutare din interiorul unei clase non-statica interna!");
        }

    }

    public static void main(String[] args) {
        // Clasa statica interna
        InnerClass.StaticNestedClassExample staticNestedClassObject = new InnerClass.StaticNestedClassExample();
        staticNestedClassObject.diplay();

        // Clasa interna non-statica
        InnerClass innerClassObject = new InnerClass();
        InnerClass.NonStaticNestedClassExample nonStaticNestedClassObject = innerClassObject.new NonStaticNestedClassExample();
        nonStaticNestedClassObject.diplay();

        /** Clase Anonime**/
        /* Clasa abstracta */
        AbstractAnimal abstractAnimalObject = new AbstractAnimal() {
            @Override
            public void makeSound() {
                System.out.println("Sunet din interiorul unei clase anonime!");

            }
        };
        abstractAnimalObject.eat();
        abstractAnimalObject.makeSound();

        /* Beneficii si scenarii comune:
         * imbunatatirea modularizarii si a structurii
         * scopul este de a izola o logica interna utilizata exclusiv in clasa de definitie
         *
         * Diferenta principala intre cele doua esste modul de apelare
         * - Static nested class se va apela la nivel de clsa -> InnerClass.StaticNestedClassExample ...
         * - Non-static Nested class se va apela la nivel de obiect -> InnerClass innerClassObject = new InnerClass(); obj.NonStaticNestedClassExample ...
         */



        /* Interfata */
        InterfaceAnimal interfaceAnimalObject = new InterfaceAnimal() {
            @Override
            public void doSound() {
                System.out.println("Sunet din interiorul unei interfete anonime!");
            }

            @Override
            public void doSomething() {
                System.out.println("Hello dintr-o implementare a unei interfete anonime!");
            }

            @Override
            public int calculateNumber() {
                return 0;
            }

            @Override
            public String generateText() {
                return null;
            }

            @Override
            public Dog getDog() {
                return null;
            }
        };
        interfaceAnimalObject.doSomething();
    }
}
