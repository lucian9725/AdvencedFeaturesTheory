package org.example.part4_generic.generic_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Initializare si definire a unui obiect de tipul unei clase concrete
        Object tmp = new Object();

        // Initializare si definire a unui obiect de tipul unei interfecte generice
        List<Integer> integerList = new ArrayList<>();

        // Initializare si definire a unui obiect de tipul unei clase generice
        Box<Integer> intBox = new Box<>(42, "numarul 42");
        Box<String> stringBox = new Box<>("Hi!", "World!");
        Box<List<String>> listStringBox = new Box<>(
                List.of("alune", "seminte"),
                "lista de cumparaturi"
        );

        System.out.println(intBox.getValue());
        System.out.println(stringBox.getValue());
        System.out.println(listStringBox.getValue());

        // Obiect de tipul unei clase generice cu parametri multipli
        Triplet<Box<String>, Integer, Map<String, Double>> triplet = new Triplet<>(
                new Box<>("text1", "text2"),
                56,
                Map.of(
                        "key text", 45.2,
                        "key text 2", 667.2
                )
        );

        System.out.println(triplet);
    }
}