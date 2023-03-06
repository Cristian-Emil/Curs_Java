package elemente_de_teorie_4;

public class Class_Inheritance {

//  INHERITANCE - Mostenirea

/*  Mostenirea este metoda princ are o clasa poate sa mosteneasca proprietatile si parametrii  altei clase

Clasa A - parintele/ superioara / baza are proprietatile a, b
Clasa B - copilul / subordonata/ derivata are proprietatea c

In clipa in care CLASS B o sa mosteneasca CLASS A atunci toate variabilelel si proprtietatiel lui A o sa poata sa fie
utilizate in cadrukl clasei B.

Aceste lucru me ajuta sa :
reutiolizam anumiter variabile, proprietati, functii de la clasa parinte
sa eliminam sa duplicam variabilele si restule elementelor


Avem mai multe tipuri de msoteniri:
1) Singulare / simple
2) Multi nivel sau etape
3) Ierarhice
4) Multiple ** - ATENTIE

Un model este exemplu CLASS_A_B prezentat:

Class A
Class B extends A
Este extindere simpla

De paote face simplu extinderea la mai multe clase in sir indian astfel incat A sa se extinda in B, B se extinde
in C si tot asa se poate merge cat este nevoie.
Este la fel ca cea anterioara doar ca se facer din clas in clasa
Se numeste extindere multinivel

Un model in care o clasa PARINTE este extinsa in doua subclase este class Parinte_copii
Class Parinte
Class Copil1
Class Copil2
Clasa Parinte este extinsa in ambele clase , deci avem extindere Ierarhica.


Extinderea MULTIPLA este cand avem 2 clase Parinte pe care dorim le extindem in clasa COPIL
Acest lucru nu este posibil in Java pt ca normal clasa COPIL extinde proprietatile claselor PARINTE iar apoi inseamna
sa remostenim aceleasi proprietati in clasa PArinte ceea ce insemana duplicizarea elementelor - ESTE INCORECT

O astfel de operatie se paote face prin OVERLOADING si OVERRIDING
 */

// Overloading si OverRiding
/*  Cand definim si incarcam diferiti parametrii observam ca ei se pot suprescrie sau supraincarca.
    In class OverLoadinDg_OverRiding se observa ca am definit 2 metode dar la final cand le chemam observam ca sunt
    3 metode in loc de 2 cate au fost initial.
    Observam ca METODA 2 apare atat cu 1 parametru cat si cu 2.
    Deci avem overloading peste metoda initiala
 */


/*
ATENTIE - SE OBSERVA CA NOI AM CREAT CLASE MULTIPLE IN CADRUL ACELEIASI CLASE :

In clasa Class_A_B avem subclasele A si B

In clasa Parinti_copii avem subclasele Parinte , Copil1 si Copil 2

In clasa Multiple_Class avem subclasele Clasa1  si Clasa2

In clasa OverLoading_OverRiding avem subclasele A1 si A2
 */


/*
Pentru SUPER.CLASA vezi clasa FiinteMain - acolo este descris modul de apelare al variabileleor din clasa
sau din superclasa
 */


}
