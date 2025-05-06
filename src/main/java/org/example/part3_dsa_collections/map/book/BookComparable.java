package org.example.part3_dsa_collections.map.book;


public class BookComparable implements Comparable<BookComparable> {

    private String titlu;
    private String autor;
    private int an;

    public BookComparable(String titlu, String autor, int an) {
        this.titlu = titlu;
        this.autor = autor;
        this.an = an;
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

    @Override
    public String toString() {
        return "Book{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", an=" + an +
                '}';
    }

    @Override
    public int compareTo(BookComparable other) {
//        int result = Integer.compare(this.an, other.an);
        // crescator ptc la insertie in mapa comparam elementul de inserat (curent)
        // cu toate elementele existente in mapa
        int result = Integer.compare(other.an, this.an);
        // descrescator ptc la insertie in mapa comparam elementele din mapa cu elementul de inserat (curent)

        // se pot adauga si alte verificari in cazul egalitatii regulii anterioare
        /*
        if(this.an == other.an) {
            // setati alta regula
        }

        ...
         */

        return result;
    }
}