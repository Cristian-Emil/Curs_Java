package elemente_de_teorie_1;

public class Angajati {


    int idAngajat;
    String nume;
    String meserie;
    int salariuAngajat;


    void display() {                                // acestea sunt metodele utilizate
        System.out.println(idAngajat);
        System.out.println(nume);
        System.out.println(meserie);
        System.out.println(salariuAngajat);
    }

    public static void main(String[] args) {               // acestea sunt obiectele clasei
        Angajati angajat1 = new Angajati();
        angajat1.idAngajat = 9;
        angajat1.nume = "David";
        angajat1.meserie = "Inginer";
        angajat1.salariuAngajat = 125000; // este valoare INT
        angajat1.display();

//  Tiparim un rand liber sa facem diferenta intre cei doi angajati
        System.out.println("");

        Angajati angajat2 = new Angajati();
        angajat2.idAngajat = 10;
        angajat2.nume = "Cosmina";
        angajat2.meserie = "Contabil";
        angajat2.salariuAngajat = 9000; // este valoare INT
        angajat2.display();
    }
}
