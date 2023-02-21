package elemente_de_teorie_3;

public class Conturi {

    private int cont;
    private String nume;
    private double valoare;
//  Am facut valorile PRIVATE pentru a nu avea oricine access la ele. Ele pot sa fie accesate doar din clasa Conturi.

/*  Pentru a ccesa GETTER si SETTERS ne ducem in BAR la functia CODE, in aceasta avem GENERATE unde dam click si avem
un dropdown list care ne afiseaza anumite variante
Alegem din lista  linia Getter and Setter si cand da click pe aceasta observam ca se deschide un tabel cu elementele
pe care dorin sa facem getter si setter.
Se alege din lista respectiva elementul dorit.
 */

    public int getCont() {
        return cont;
    }
    public void setCont(int cont) {
        this.cont = cont;
    }
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getValoare() {
        return valoare;
    }

    public void setValoare(double valoare) {
        this.valoare = valoare;
    }
}
