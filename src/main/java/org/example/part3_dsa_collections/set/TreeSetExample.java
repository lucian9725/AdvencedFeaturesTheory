package org.example.part3_dsa_collections.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    // todo: incercati sa decuplati cele 2 clase prin definirea lor ca si clase concrete individuale
    // astfel incat sa le apelati direct in main
    static class AnimalComparable implements Comparable<AnimalComparable> {
        private String name;
        private int age;
        private double weight;

        public AnimalComparable(String name, int age, double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "AnimalComparable{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    '}';
        }

        // Intr-un comparator depinde foarte mult de ordinea de comparatie intre elemente. Adica, cine e primul.
        // currentObj.compareTo(otherObj);
        // TreeSet sortedSet ={ {"Elefant", 7, 500}, {"Tigru", 2, 233} };
        @Override
        public int compareTo(AnimalComparable other) {
            // int result = Double.compare(this.weight, other.weight);  // ordinea crescatoare -> 233 ? 500 => 233 < 500 => result < 0 =>
            int result = Double.compare(other.weight, this.weight);     // ordine descrescatoare

            if (result == 0) {
//                result = this.name.compareTo(other.name);   // verificam ordinea lexicografica a numelor, DACA greutatile sunt egale
                result = other.name.compareTo(this.name);
            }

            return result;
        }
    }

    static class AnimalComparator {
        private String name;
        private int age;
        private double weight;

        public AnimalComparator(String name, int age, double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "AnimalComparable{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    '}';
        }
    }

    public static void main(String[] args) {
        // Example with Comparable
        Set<AnimalComparable> comparableSet = new TreeSet<>();

        comparableSet.add(new AnimalComparable("Elefant", 10, 600.2));
        comparableSet.add(new AnimalComparable("Tigru", 2, 220.21));
        comparableSet.add(new AnimalComparable("Leu", 2, 220.2));
        comparableSet.add(new AnimalComparable("Girafa", 5, 300.3));
        comparableSet.add(new AnimalComparable("Rinocer", 7, 300.3));

        for (AnimalComparable it : comparableSet) {
            System.out.println(it.getWeight() + " " + it.getName() + " " + it.getAge());
        }
        System.out.println("-------------------------------------");

        // Example with Comparator
        Comparator<AnimalComparator> comparatorForAnimals = Comparator
                .comparingInt(AnimalComparator::getAge) // (it1, it2) -> Integer.compare(it1.getAge(), it2.getAge()), it1 = this, it2 = other
                .thenComparing(AnimalComparator::getName)
                .thenComparing((it1, it2) -> Double.compare(it2.getWeight(), it1.getWeight()))
                .reversed() // nu inverseaza regula de comparatie, ci intreg setul
                ;
        Set<AnimalComparator> comparatorSet = new TreeSet<>(comparatorForAnimals);

        comparatorSet.add(new AnimalComparator("Elefant", 12, 788.12));
        comparatorSet.add(new AnimalComparator("Elefant", 12, 500));
        comparatorSet.add(new AnimalComparator("Elefant", 9, 1000));
        comparatorSet.add(new AnimalComparator("Maimuta", 2, 45));
        comparatorSet.add(new AnimalComparator("Ornitorinc", 5, 12));

        for(AnimalComparator it : comparatorSet) {
            System.out.println(it.getWeight() + " " + it.getName() + " " + it.getAge());
        }
    }
}
