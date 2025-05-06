package org.example.part4_generic.generic_class;

public class Triplet<K, V1, V2> {
    private K key;
    private V1 valueOne;
    private V2 valueTwo;

    public Triplet(K key, V1 valueOne, V2 valueTwo) {
        this.key = key;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    @Override
    public String toString() {
        return "Triplet{" +
                "key=" + key +
                ", valueOne=" + valueOne +
                ", valueTwo=" + valueTwo +
                '}';
    }
}