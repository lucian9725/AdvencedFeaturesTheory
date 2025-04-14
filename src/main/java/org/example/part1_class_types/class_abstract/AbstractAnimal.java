package org.example.part1_class_types.class_abstract;

/*
    Ce este?
        O clasa abstracta este o clasa care nu poate sa instantieze un obiect, in plus poate sau nu sa
    contina metode abstracte.

        O metoda abstracta este o metoda care se defineste prin semnatura fara a avea un bloc de cod.

    Cand folosim?
        - cand construim o clasa de baza (clasa parinte) care stocheaza o serie de functionalitati
    generice, menite a fi implementate in mod specific in clasele copil
        - clasele abstracte prin relatia de mostenire, FORTEAZA clasele copil (sub clasele) sa implementeze
    metodele abstracte
        - in mod automat, se creaza o ierarhie intre calse -> LAYER DE ABSTRACTIZARE

    Scenarii comune:
        - o clasa abstracta poate fi o clasa parinte pt o serie de tabele care stocheaza o cheie primara,
    si strategia de indexare in baza de date relationala
        - in game development, o clasa parinte abstracta poate fi o clasa care defineste o categorie de
    personaje
        - template pattern in OOP
 */

public abstract class AbstractAnimal {

    public abstract void makeSound();

    public void eat() {
        System.out.println("Animalul mananca din parent clas-ul AbstractAnimal!");
    }
}