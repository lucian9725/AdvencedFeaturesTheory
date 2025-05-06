package org.example.part3_dsa_collections.map;

/*  INTRO MAP:
    Map<K, V> = este o structura de date care stocheaza o multime de elemente, caracterizate sub
    forma unor perechi
    Perechi sunt compuse din cheie si valoare si respecta urmatoarele caracteristici:
    - cheia este unica pe baza hashcode-ului
    - fiecare cheie MAPEAZA o singura valoare, avand o relatie 1:1
    - valoarea poate lua orice forma fara nicio restrictie

    Map este o interfata, similara Set-ului, care stabileste un contract metodelor CRUD.
    Ca si implementari, discutam despre HashMap, TreeMap si EmumMap.
 */

/*  HashMap:
    - nu impune niciun fel de ordonare a perechilor
    - permite stocarea unei singure perechi cu cheie si valoare nula,
        -- putem avea O SINGURA CHEIE NULA, astfel incat sa respectam principiul unicitatii
        -- putem avea cate valori nule vrem, atata timp cat cheia e nenula, sau cat exista o singura cheie nula
    - complexitatea la GET/PUT/REMOVE este 0(1) -> e o complexitate caracteristica operatiilor de asignare

 */

/*  INTRO MAP:
    Map<K, V> = este o structura de date care stocheaza o multime de elemente, caracterizate sub
    forma unor perechi
    Perechi sunt compuse din cheie si valoare si respecta urmatoarele caracteristici:
    - cheia este unica pe baza hashcode-ului
    - fiecare cheie MAPEAZA o singura valoare, avand o relatie 1:1
    - valoarea poate lua orice forma fara nicio restrictie

    Map este o interfata, similara Set-ului, care stabileste un contract al metodelor CRUD.
    Ca si implementari, discutam despre HashMap, TreeMap si EnumMap.
 */

/*  HashMap:
    - nu impune niciun fel de ordonare a perechilor
    - permite stocarea unei singure perechi cu cheie si valoare nula
        -- putem avea O SINGURA CHEIE NULA, astfel incat sa respectam principiul unicitatii
        -- putem avea cate valori nule vrem, atata timp cat cheia e nenula, sau cat exista o singura cheie nula
    - complexitatea la GET/PUT/REMOVE este O(1) -> e o complexitate caracteristica operatiilor de asignare

 */

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, String> capitaleSiTari = new HashMap<>();
        capitaleSiTari.put("Romania", "Bucuresti");
        capitaleSiTari.put("Franta", "Paris");
        capitaleSiTari.put("Italia", "Roma");
        System.out.println(capitaleSiTari);
        System.out.println("-----------------------------");

        capitaleSiTari.putAll(Map.of(
                "Germania", "Berlin",
                "Spania", "Madrid"
        ));
        System.out.println(capitaleSiTari);
        System.out.println("-----------------------------");

        capitaleSiTari.putIfAbsent("UK", "Londra");
        capitaleSiTari.putIfAbsent("Romania", "Cluj");
        // putIfAbsent, intai face o verificare de continut asupra hashcode-ului cheii:
        // - daca containsKey intoarce true, nu se adauga in Map
        // - daca containsKey intoarce false, se adauga in Map prin crearea unui nou spatiu de memorie
        System.out.println(capitaleSiTari);
        System.out.println("-----------------------------");

        capitaleSiTari.put("Romania", "Cluj");
        // put, intai face o verificare de continut asupra hashcode-ului cheii:
        // - daca containsKey intoarce true, se actualizeaza perecheaza cu noua valoare
        // - daca containsKey intoarce false, se adauga in Map prin crearea unui nou spatiu de memorie
        System.out.println(capitaleSiTari);
        System.out.println("-----------------------------");

        System.out.println(capitaleSiTari.get("Romania"));
        System.out.println(capitaleSiTari.get("Norvegia"));
        System.out.println(capitaleSiTari.getOrDefault("Norvegia", "Nu se gaseste in map! Incercati cu alta tara!"));
        System.out.println(capitaleSiTari.getOrDefault("Italia", "Nu se gaseste in map! Incercati cu alta tara!"));
        System.out.println("-----------------------------");

        System.out.println(capitaleSiTari.remove("Spania"));
        System.out.println(capitaleSiTari.remove("Norvegia"));
        System.out.println(capitaleSiTari);
        System.out.println("-----------------------------");

        System.out.println(capitaleSiTari.remove("Franta", "Paris"));
        System.out.println(capitaleSiTari.remove("Franta", "Sorbona"));
        System.out.println(capitaleSiTari.remove("Norvegia", "Oslo"));
        System.out.println(capitaleSiTari);
        System.out.println("-----------------------------");

        // Iteratie la nivel de pereche
        for(Map.Entry<String, String> it: capitaleSiTari.entrySet()) {
            System.out.println(it.getKey() + " -> " + it.getValue());
        }
        System.out.println("-----------------------------");

        // Iteratie la nivel de chei
        for(String it: capitaleSiTari.keySet()) {
            System.out.print(it + " ");
        }
        System.out.println("\n-----------------------------");

        // Iteratie la nivel de valori
        for(String it: capitaleSiTari.values()) {
            System.out.print(it + " ");
        }
        System.out.println("\n-----------------------------");
    }

    // List = {1,1,2,41,2,1,2,1,1,2,2,1,1,23,3,2}
    // Creati o mapa de frecventa Map = { 1=7, 2=6, ...}
}