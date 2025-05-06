package org.example.part3_dsa_collections.map.book;

public class Book {
    private String titlu;
    private String autor;
    int an;

    public Book(String titlu, String autor, int an) {
        this.titlu = titlu;
        this.autor = autor;
        this.an = an;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", an=" + an +
                '}';
    }

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public int getAn() {
        return an;
    }
}


