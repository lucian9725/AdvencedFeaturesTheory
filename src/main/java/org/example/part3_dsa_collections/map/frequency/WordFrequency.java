package org.example.part3_dsa_collections.map.frequency;

/* Map<String,int> map = new HasMap<>();
    -> arunca eroare de compilatie pt ca HashMap accepta doar clase de tipul Object sau descendenti
       ai acesteia
    -> Map este o interfata generica de tipul Map<K,V> unde K,V sunt Objects
 */

import java.util.*;

/*
    Avem o lista de cuvinte, afisati frecventa aparitiei cuvintelor
    Input:
        List = { "apple", "banana", "apple", "orange", "banana", "apple"}
    Output:
        apple -> 3
        banana -> 2
        orange -> 1
 */
public class WordFrequency {

    public static void main(String[] args) {
        // Mtoda 1: Calcularea mapei de frecvente
        //Calcularea mapei de frecventa a aparitiilor cuvintelor in lista
        List<String> cuvinte = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "apple"));
        Map<String, Integer> freqCuvinte = new HashMap<>();

        for (String it:cuvinte){
            if (freqCuvinte.containsKey(it)){
                freqCuvinte.put(it, freqCuvinte.get(it) + 1);
            } else {
                freqCuvinte.put(it,1);
            }
        }

        System.out.println(freqCuvinte);

        // Metida 2: idem cerinta, insa cu o singura linie de cod
        freqCuvinte.clear(); // va sterge toate perechile de mapa
        System.out.println("Mapa are dimensiunea: " + freqCuvinte.size());

        for (String it : cuvinte){
            freqCuvinte.put(it, freqCuvinte.getOrDefault(it,0 ) + 1);
        }

        System.out.println(freqCuvinte + "\n-------------------");

        SortedMap<String,Integer> sortedtFreqCuvinte = new TreeMap<>(freqCuvinte);
        System.out.println(sortedtFreqCuvinte + "\n--------------------------------");

    }
}
