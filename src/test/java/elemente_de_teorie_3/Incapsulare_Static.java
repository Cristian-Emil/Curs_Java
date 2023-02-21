package elemente_de_teorie_3;

public class Incapsulare_Static {

//INCAPSULARE

/*
Incapsularea este un mecanism care vă permite să protejați starea internă a unui obiect de accesul extern și
modificarea.
Acest lucru se realizează prin utilizarea modificatorilor de acces precum public, privat și protejat pentru
a restricționa accesul membrilor clasei. Iată un exemplu de încapsulare în Java:

Avanatajele acestei metode sunt:
impachetarea datelor si metodelor se face in unitati individuale (clasa)
toate variabilele trebuie sa fie private
putem accesa variabile doar prin metodele de apelare - GETTERS și SETTERS

 */

//STATIC class

/*
Metodele statice pot accesa metode, elemente direct - fara obiect ( OBJECT )
Metodele statice pot accesa elemente non-statice prin intermediul unui OBJECT
Metodele non-statice pot accesa orice direct , fara OBJECT

Problemele apar cand incercam sa ccesa metodele non-statice prin intermediul metodleor statice
ATUNCI TREBUIE SA AVEM UN OBIECT (OBJECT) PRIN INTERMEDIUL CARUIA SA CHEMAM METODA DORITA

Vezi clasa "Static1"

Daca separam elementele statice si le accesam din alta clasa fata de cea in care sunt definite atunci avem probelme.
O metoda este sa le IMPORTAM.
import static elemente_de_teorie_3.Static.*;

sau sa le definim de unde le luam scriind in fata acestora clasa de unde se acceseaza.
       System.out.println(Static.a);
       Static.meth1();;

Deci am specificat CLASA STATIC de unde acestea se acceseaza

 */

/*
Exemplu:

Cum putem accesa elemente din cadrul unei clase statice

Class TESTARE
{
    static String A = "Bun venit";
}
Test.s length() --- ne afiseaza numarul de elemente ale textului

Se observa ca elementul este definit STATIC si deci nu trebuie sa avem un obiect ca sa-l chemama prin
metoda STATIC specificata.
Exercitiul returneaza numarul de caractere ce exista in textul scris , inclusiv spatiile libere dintre cuvinte
 */






}
