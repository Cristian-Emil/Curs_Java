package elemente_de_baza;

public class Curs1_5_Metode_in_JAVA {
    public static void main(String[] args) {
        System.out.println("Aceasta este metoda MAIN ( implicita ), este predifinita si se apleaza din JDK");
//  Metoda PRINTLN  nu se vede deoarece ea exista predefinita in JDK

//  Apelam metoda "MetodaVOID" din interiorul acestei metode, prin linia urmatoare:
        MetodaVOID();

// tiparim un rand liber folosind sintaxa "" ;
        System.out.println("");

//  Apelam metoda "MetodaCALCUL" din interiorul acestei metode, prin linia urmatoare in care punem si valoare pt DUBLU:
        MetodaCALCUL(6.2);

// tiparim 2 randuri liber folosind sintaxa "\n" ; sintaxa "\n" ne trece automat pe randul urmator
        System.out.println("\n");

//  Ca sa vedem rezultatul "MetodaReturnareINT" trebuie sa tiparim rezultaatul pe ecran:
        System.out.println("Afisam rezultatul MetodaReturnareINT = " + MetodaReturnareINT(9));
    }

/*  Exista si alte tipuri de metode de acces.

    Tipul PUBLIC - este TIPUL DE ACCES
    Tipul STATIC - este un membru al clasei prin care se definesc variabilele in cadrul clasei
// metodele statice pot fi apelate fara sa fie nevoie sa se creeze o instanta a clasei in care sa fie definite.
    Tipul VOID - este tipul returnat ( adica nu returneaza nimic )

Exemplu de mai jos
*/

    static void MetodaVOID(){
        System.out.println("MetodaVOID - este metoda definita de utilizator");
    }
// Metodele trebuie mereu sa fie scrise intr-o clasa.


    static void MetodaCALCUL(double dublu){
        double rezultat1 = dublu * 2;
        System.out.println("Afisam rezultatul MetodaCALCUL = " + rezultat1);
    }

//  Cream o metoda care sa returneze o valoare, un INT:
//  O metoda poate sa fie apelata din interiorul altei metode. Metoda de mai jos o apelam din clasa anterioara
    static int MetodaReturnareINT ( int intreg){
        int rezultat2 = intreg * intreg;
        return rezultat2;


    }

}
