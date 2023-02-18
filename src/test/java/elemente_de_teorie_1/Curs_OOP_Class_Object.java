package elemente_de_teorie_1;

public class Curs_OOP_Class_Object {

/*
class - este o colectie de atribute si caracteristici/comportamente, elemente non fizice
sintaxa unei clase este :

class{
variables
methods
}

object - sunt instante al "class", in principiu entitati fizice si sunt independente

Example:

class               objects
Student     ----    Mircea , Ion , Vasile , Maria , Mihaela
Angajat     ----    David , Cosmina , Ioana , Cristian , Mihai
Animale     ----    caine , vulpe , pisica , elefant , cal

 */

//  Model de class si obiecte - exemplul 1 :

    public class Angajati {                         // aceasta este clasa creata

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

    public void main(String[] args) {               // acestea sunt obiectele clasei
        Angajati angajat1 = new Angajati();
        angajat1.idAngajat = 9;
        angajat1.nume = "David";
        angajat1.meserie = "Inginer";
        angajat1.salariuAngajat = 125000; // este valoare INT
        angajat1.display();

        Angajati angajat2 = new Angajati();
        angajat2.idAngajat = 10;
        angajat2.nume = "Cosmina";
        angajat2.meserie = "Contabil";
        angajat2.salariuAngajat = 9000; // este valoare INT
        angajat2.display();

//  Cand rulam programul o sa ne tipareasca caracteristicile angajatului specificat - ID, nume,mesria si salriul
//  RULATI class ANGAJATI pentru a vedea cum ruleaza programul.
//  Pentru a putea rula si aici ce este tiparit mai sus este necesar se extindem clasa Angajati aici - vezi formatul d emai jos.

//  public class Curs_OOP_Class_Object extends Angajati { ..... }

    }


//  Exewmplu numarul 2 :
//  La fel avem class Anagjati_Diverse si AngajatiMain.
//  Daca ruleaza clasa AngajatiMain o sa afisam exact formatul definit in Angajati_Diverse.


    }
}
