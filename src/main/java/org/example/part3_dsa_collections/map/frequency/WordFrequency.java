package org.example.part3_dsa_collections.map.frequency;

/* Map<String, int> map = new HashMap<>();
    -> arunca eroare de compilatie ptc HashMap accepta doar clase de tipul Object sau descendenti ai acesteia
    -> Map este o interfata generica de tipul Map<K, V>, unde K, V sunt Objects
*/
/*
    Avem o lista de cuvinte, afisati frecventa aparitiei cuvintelor.
    Input:
        List = { "apple", "banana", "apple", "orange", "banana", "apple"}
        SAU
        String =  "apple banana apple orange banana apple";
        List = String.split(" ")
    Output:
        apple -> 3
        banana -> 2
        orange -> 1
 */

import java.util.*;

public class WordFrequency {

    public static void main(String[] args) {
        // Metoda 1: Calcularea mapei de frecventa a aparitiilor cuvintelor in lista
        List<String> cuvinte = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "apple"));
        Map<String, Integer> freqCuvinte = new HashMap<>();
        for (String it : cuvinte) {
            if (freqCuvinte.containsKey(it)) {
                // TRUE -> a fost identificata cheia in mapa, prin urmare se incrementeaza nr aparitiilor
                freqCuvinte.put(it, freqCuvinte.get(it) + 1);
            } else {
                // FALSE -> nu a fost identificata cheia in mapa, prin urmare se adauga o noua pereche cu valoare 1
                freqCuvinte.put(it, 1);
            }
        }
        System.out.println(freqCuvinte + "\n------------------------");

        // Metoda 2: idem cerinta, insa cu o singura linie de cod
        freqCuvinte.clear();    // va sterge toate perechile din mapa
        System.out.println("Mapa are dimensiunea: " + freqCuvinte.size());
        for (String it : cuvinte) {
            freqCuvinte.put(it, freqCuvinte.getOrDefault(it, 0) + 1);
        }
        System.out.println(freqCuvinte + "\n------------------------");

        // Metoda 1: Sortare alfabetica/crescatoare/lexicografica a Mapei dupa cheia String
        // nu avem comparator
        SortedMap<String, Integer> sortedFreqCuvinte = new TreeMap<>(freqCuvinte);
        // valabil si la nivel de set de clase simple: String, Integer, Float, Double, Character etc
        System.out.println(sortedFreqCuvinte + "\n------------------------");

        // Metoda 2: Sortare alfabetica/crescatoare/lexicografica a Mapei dupa cheia String
        // avem comparator
        TreeMap<String, Integer> descendingFreqCuvinte = new TreeMap<>(
                Comparator
                        .comparingInt(String::length)
                        // sortam crescator dupa lungimea cuvantului
                        .reversed()
                        // inversam ordinea elementor in mapa, astfel incat sa fie descrescator
                        .thenComparing(Comparator.naturalOrder())
                // daca lungimile a doua cuvinte sunt egale, sortam in ordinea naturala
                // -> ordinea introducerii datelor in map
                // in situatia unei clase de obiect, putem avea pe thenComparing
                // o alta regula de sortare bazata pe alte atribute din clasa
        );
        descendingFreqCuvinte.putAll(freqCuvinte);
        System.out.println(descendingFreqCuvinte + "\n------------------------");
    }
}
