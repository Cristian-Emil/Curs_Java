package elemente_de_teorie_1;

public class Angajati_Diverse {

    int angajatID;
    String nume;
    char pregatire;

    public Angajati_Diverse() {

    }

    //  Avem metoda 1 - utilizam VARIABILE ( de referinta ) - se folosesc obiecte
    void prezentare(){                          //   SUNT LEGATE DE CLASA SI NU AU PARAMETRII
        System.out.println( angajatID + " " + nume + "  " + pregatire);

    }

//  Avem metoda - utilizam o "METODA" - apeland date
    void setareDate ( int ID, String Nume , char Eng){
        angajatID = ID;
        nume = Nume;
        pregatire = Eng;
    }

//  Avem metoda 3 - utilizam un CONSTRUCTOR , deci trebuie sa utilizam numele clasei in care ne aflam
//  Consturctorul nu va returna valoare , deci nu se utilizeaza VOID dar trebuie definit la inceput

    Angajati_Diverse ( int ID, String Nume , char Eng){
        angajatID = ID;
        nume = Nume;
        pregatire = Eng;
    }

}
