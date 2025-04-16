package org.example.part1_class_types.class_final;

/*
        final, in functie de unde este utilizat, are o anumita definitie:
        - la nivel de variabila, creaza constante care impiedica reasignarea
        - la nivel de metoda, previne metoda in a fi suprascrisa
        - la nivel de clasa, previne mostenirea
 */

public final class MathUtils {

    public final String CONSTANT_TEXT = "This text is constant!";
    public static final int MAX_VALUE = 99;

    // in momentul in care MathUtils va fi mostenita, nu vom putea suprascrie aceasta metoda
    // daca se incearca suprascrierea, va arunca o eroare de compilare
    public final double calculateSquareValue(int number) {
        return Math.sqrt(number);
    }
}