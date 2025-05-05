package org.example.part3_dsa_collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<String> users = new HashSet<>();
        users.add("Ana");
        users.add("are");
        users.add("mere");
        users.add(".");
        System.out.println(users);
        System.out.println("--------------------");

        users.add("mere");  // nu se arunca exceptii in situatia in care se introduc valori existente
        users.add(null);    // poate exista in HashSet/LinkedHashSet, dar nu poate exista in TreeSet
        System.out.println(users);
        System.out.println("--------------------");

        Set<String> words = new HashSet<>();
        words.addAll(Set.of("Ion", "mancare", "Ana", "caine", "."));

        users.retainAll(words); // face intersectia valorilor comune intre 2 structuri de date
        for (String it : users) {
            System.out.print(it + " ");
        }
        System.out.println("\n--------------------");

        System.out.println(displayUniqueValues(List.of(1, 2, 2, 3, 4, 4, 2, 1, 3, 4, 4, 4, 1, 21)));
        System.out.println(displayDuplicateValues(List.of(1, 2, 2, 3, 4, 4, 2, 1, 3, 4, 4, 4, 1, 21)));
    }

    // todo: implementati un algoritm de verificare a frecventei elementor folosind Map
    private static List<Integer> displayDuplicateValues(List<Integer> numbers) {
        List<Integer> duplicateExcessNumbers = new ArrayList<>();
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (Integer it : numbers) {
            if(uniqueNumbers.contains(it)) {
                duplicateExcessNumbers.add(it);
            } else {
                uniqueNumbers.add(it);
            }
        }
        // 1, 2, 2, 3, 4, 4, 2, 1, 3, 4, 4, 4, 1, 21
        // i = 0 -> it = 1 -> uniqueNumbers = {1}, duplicateExcessNumbers = {}
        // i = 1 -> it = 2 -> uniqueNumbers = {1,2}, duplicateExcessNumbers = {}
        // i = 2 -> it = 2 -> uniqueNumbers = {1,2}, duplicateExcessNumbers = {2}
        // i = 3 -> it = 3 -> uniqueNumbers = {1,2,3}, duplicateExcessNumbers = {2}
        // i = 4 -> it = 4 -> uniqueNumbers = {1,2,3,4}, duplicateExcessNumbers = {2}
        // i = 5 -> it = 4 -> uniqueNumbers = {1,2,3,4}, duplicateExcessNumbers = {2,4}
        // i = 6 -> it = 2 -> uniqueNumbers = {1,2,3,4}, duplicateExcessNumbers = {2,4,2}
        // i = 7 -> it = 1 -> uniqueNumbers = {1,2,3,4}, duplicateExcessNumbers = {2,4,2,1}
        // ...
        // i = 13 -> it = 21 -> uniqueNumbers = {1,2,3,4,21}, duplicateExcessNumbers = {2,4,2,1,...}

        return duplicateExcessNumbers;
    }

    /*
        Algoritm de verificare a unicitatii folosind liste:
        numbers = {1,2,2,3,4,4,2,1,3,4,4,4,1,21}
        uniqueNumbers = {}
        for i = 0, numbers.size, i++
            if(!uniqueNumbers.contains(numbers.get(i))
                uniqueNumbers.add(numbers.get(i))

        print uniqueNumbers
        // --------------------------------------
        numbers = {1,2,2,3,4,4,2,1,3,4,4,4,1,21}
        uniqueNumbers = {}
        for i = 0, numbers.size, i++
            if(uniqueNumbers.contains(numbers.get(i))
                    continue;
                else
                    uniqueNumbers.add(numbers.get(i))

        print uniqueNumbers
     */
    private static Set<Integer> displayUniqueValues(List<Integer> numbers) {
        Set<Integer> resultUniqueValues = new HashSet<>(numbers);
        return resultUniqueValues;
        // return new HashSet<>(numbers);
    }
}
