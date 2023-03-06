package elemente_de_teorie_5;

public class Clasa_PQR extends Clasa_MNO implements Interfata_ABC, Interfata_XYZ {

//  daca dorim sa extindem clasa Clasa_MNO in clasa Clasa_PQR atunci trebuie sa punem conditia EXTENDS
//  am implementat cele 2 interfete ABC si XYZ
// ATENTIE: intai se extinde clasa apoi se implementeaza celelelate elemente

    @Override
    public void met1() {
        System.out.println("Aceasta este metoda met1 din ABC");
        System.out.println(x);
    }

    @Override
    public void met2() {
        System.out.println("Aceasta este metoda met2 din XYZ");
        System.out.println(y);
    }

    public static void main(String[] args) {
        Clasa_PQR obiect = new Clasa_PQR();

        obiect.met1();
        obiect.met2();
        obiect.met3();

//  se observa ca toate cele 3 sunt parintii unei singure clasae in care sunt extinse si implementate.

    }

}
