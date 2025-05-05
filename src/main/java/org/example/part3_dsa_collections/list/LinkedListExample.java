package org.example.part3_dsa_collections.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {

    public static void main(String[] args) {
        List<String> books = new LinkedList<>();

        books.add("Book 1");
        books.add("Book 2");

        for (String it: books) {
            System.out.print(it + " ");
        }
        System.out.println("\n-------------");

        ListIterator<String> nextListIterator = books.listIterator();
        while(nextListIterator.hasNext()) {
            System.out.print(nextListIterator.next() + " ");
        }
        System.out.println("\n-------------");

        // todo: nu afiseaza nimic
        ListIterator<String> prevListIterator = books.listIterator();
        while(prevListIterator.hasPrevious()) {
            System.out.print(prevListIterator.previous() + " ");
        }
    }
}