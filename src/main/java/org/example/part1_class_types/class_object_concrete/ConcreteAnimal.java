package org.example.part1_class_types.class_object_concrete;

/*
    Ce este?
        O clasa concreta este o clasa de obiect prin care putem defini o serie de atribute si functionalitati,
        astfel incat sa putem defini si instantia prin constructori instante de obiect.

    Cand folosim?
        - in situatiile in care putem reutiliza codul
        - in situatiile in care nu avem nevoie de abstractizare multi-layered
            -- in general avem MAXIM un nivel de abstractizare
        - in situatiile in care putem defini comportament specific unui obiect
            -- metode influentate de atributele clasei

    Scenarii comune:
        - clase utilitare pt concepte abstracte
            -- clasa pt date calendaristice -> avem mai multe metode care returneaza data in functie de anumite conditii
            -- clasa pt obiecte caracterizabile -> avem metode definite in functie de atribute
        - clase model: o clasa de model e o clasa de obiect pe care o utilizam ca si referinta intre
        tabel si cod
            -- clasa de obiect poate defini un tabel in functie de atribute
            -- atributele devin capul de tabel, coloanele
            -- valorile obiectelor devin valorile de pe fiecare linie
            -- in general avem aceste concepte in aplicatiile care folosesc baze de date
            -- de ex: JDBC, Hibernate, Spring Data
 */

import java.util.Objects;

public class ConcreteAnimal {
    // atribute
    private String rasa;
    private int varsta;

    // constructori
    public ConcreteAnimal(String rasa, int varsta) {
        this.rasa = rasa;
        this.varsta = varsta;
    }

    public ConcreteAnimal() {
    }

    // getters/setters
    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    // metode functionale
    public String categorieVarsta() {
        if (varsta < 2) {
            return "junior";
        } else if (varsta <= 8) {
            return "adult";
        } else {
            return "senior";
        }
    }

    // metode suprascrise
    @Override
    public String toString() {
        return "ConcreteAnimal{" +
                "rasa='" + rasa + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    // ConcreteAnimal animal1 = new ...
    // ConcreteAnimal animal2 = new ...
    // animal1.equals(animal2)

    @Override
    public boolean equals(Object o) {
        // verifica faptul ca argumentul pe care equals il primeste este de tipul de date ConcreteAnimal
        // daca nu este de acel tip de date, automat returneaza false ptc nu se pot compara 2 obiecte
        // de tipuri de date diferite
        // (o instanceof ConcreteAnimal that) - verifica ca obiectul 'o' este de tipul de date ConcreteAnimal
        // !(o instanceof ConcreteAnimal that) - verifica ca obiectul 'o' NU este de tipul de date ConcreteAnimal
        if (!(o instanceof ConcreteAnimal that)) return false;
        return getVarsta() == that.getVarsta() && Objects.equals(getRasa(), that.getRasa());
        // echivalent cu return varsta == that.varsta && Objects.equals(rasa, that.rasa);
        // deoarece getVarsta() returneaza varsta
        // deoarece getRasa() returneaza rasa
    }

    /*
    @Override
    public boolean equals(Object o) {
        // o == null -> verificam ca obiectul e egal cu null
        // getClass() != o.getClass() <----> !(o instanceof ConcreteAnimal that)
        if (o == null || getClass() != o.getClass()) return false;
        ConcreteAnimal that = (ConcreteAnimal) o; // face conversia de la Object la ConcreteAnimal
        // double value = 2.22;
        // float nr = (float) value; => nr = value = 2.22
        return getVarsta() == that.getVarsta() && Objects.equals(getRasa(), that.getRasa());
    }
    */

    @Override
    public int hashCode() {
        return Objects.hash(getRasa(), getVarsta());
    }
}