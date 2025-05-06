package org.example.part4_generic;

public class Box<T> {

    private T value;
    private String label;
    private static int count;

    public Box(T value, String label) {
        this.value = value;
        this.label = label;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                ", label='" + label + '\'' +
                '}';
    }
}