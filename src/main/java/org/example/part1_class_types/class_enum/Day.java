package org.example.part1_class_types.class_enum;

/*
    Am creat o enumeratie de elemente constante, inseamna ca nu putem reasigna valoarea obiectelor
    din enum.
 */
public enum Day {
    // tipul de date standard al obiectelor din enumeratie este String
    LUNI, MARTI, MIERCURI, JOI, VINERI, SAMBATA, DUMINICA   // sunt obiecte de tipul enum Day

    /*
    NU FUNCTIONEAZA IMPREUNA DPDV LOGIC

    fie enum cu constante, fie final class
    public static final String value = "value";
    public static final int number = 22;
    */
}