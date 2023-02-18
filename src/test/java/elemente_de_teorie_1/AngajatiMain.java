package elemente_de_teorie_1;

public class AngajatiMain {

    public static void main(String[] args) {

        System.out.println("Metoda 1 - definirea variabilelor");
        Angajati_Diverse angajat = new Angajati_Diverse();
        angajat.angajatID = 7;
        angajat.nume = "Vasile";
        angajat.pregatire = 'C';
        angajat.prezentare();

        System.out.println(""); // seapram metodele

        System.out.println("Metoda 2 - utilizarea unei metode");
        angajat.setareDate( 10, "Mircea", 'B');
        angajat.prezentare();

        System.out.println(""); // seapram metodele

        System.out.println("Metoda 3 - definirea unui cosntructor ");
        Angajati_Diverse angajat1 = new Angajati_Diverse(9, "Cristian", 'A');
        angajat1.prezentare();

    }

}




