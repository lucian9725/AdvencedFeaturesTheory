
package org.example.part3_dsa_collections.map;

import org.example.part3_dsa_collections.map.book.Book;
import org.example.part3_dsa_collections.map.book.BookComparable;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        // Exemplu cu Comparable
        SortedMap<BookComparable, String> booksByYear = new TreeMap<>();
        booksByYear.put(new BookComparable("1984", "Orwell", 1949), "Distopic");
        booksByYear.put(new BookComparable("Brave New World", "Huxley", 1932), "SF");
        booksByYear.put(new BookComparable("Sapiens", "Harari", 2011), "Istoric");

        for(Map.Entry<BookComparable, String> it: booksByYear.entrySet()) {
            System.out.println(it.getKey() + " -> " + it.getValue());
        }
        System.out.println("-----------------------------------");

        Comparator<Book> comparatorByTitle = (currentBook, otherBook) -> currentBook.getTitlu().compareTo(otherBook.getTitlu());
        Comparator<Book> comparatorByTitle2 = Comparator.comparing(Book::getTitlu);
        // cele 2 comparatoare sunt identice
        // atata timp cat expresia lambda este o expresie care face compratie doar la nivelul unei singure metode,
        // impunand ordinea crescatoare, putem REDUCE toata expresia la apelarea referentiala la nivel de clasa
        // insa daca schimbam si cel mai mic lucru, precum ordinea, sa fie descrescatoaare, trebuie automat sa scriem expresia lambda
        Comparator<Book> comparatorByTitle3 = (currentBook, otherBook) -> otherBook.getTitlu().compareTo(currentBook.getTitlu());
        Comparator<Book> comparatorByTitle4 = Comparator
                .comparing(Book::getTitlu)
                .thenComparing((currentBook, otherBook) -> otherBook.getAutor().compareTo(currentBook.getAutor()))
                .reversed();
        TreeMap<Book, String> booksByTitle = new TreeMap<>(comparatorByTitle4);
        booksByTitle.put(new Book("1984", "Orwell", 1949), "Distopic");
        booksByTitle.put(new Book("1984", "Jianu", 1949), "Distopic");
        booksByTitle.put(new Book("Brave New World", "Huxley", 1932), "SF");
        booksByTitle.put(new Book("Sapiens", "Harari", 2011), "Istoric");

        for(Map.Entry<Book, String> it: booksByTitle.entrySet()) {
            System.out.println(it.getKey() + " -> " + it.getValue());
        }
        System.out.println("-----------------------------------");

        Comparator<BookComparable> comparatorByAuthor = (b1, b2) -> b2.getAutor().compareTo(b1.getAutor());
        Map<BookComparable, String> booksByAuthor = new TreeMap<>(comparatorByAuthor);
        booksByAuthor.put(new BookComparable("1984", "Orwell", 1949), "Distopic");
        booksByAuthor.put(new BookComparable("Brave New World", "Huxley", 1932), "SF");
        booksByAuthor.put(new BookComparable("Sapiens", "Harari", 2011), "Istoric");

        for(Map.Entry<BookComparable, String> it: booksByAuthor.entrySet()) {
            System.out.println(it.getKey() + " -> " + it.getValue());
        }
        System.out.println("-----------------------------------");
    }
}