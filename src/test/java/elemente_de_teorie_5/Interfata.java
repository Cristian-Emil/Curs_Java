package elemente_de_teorie_5;

public class Interfata {

//  FINAL - utilizarea acestei sintaxe
/*  final - utilizarea lui "final" pentru avriabile ne impune urmatoarele conditii:

varaibile   - nu se paote modifica valoarea varaibilei ( este constanta )
metode      - nu putem sa trecem peste ( override ) metode in clasele copil
clasele     - nu putem sa extindem o clasa in alta clasa, aceasta trebuie apelata prin "fabricarea" unui obiect ( OBJECT )
 */

//  Data Abstraction
/*  abstractizarea este un proces de ascundere a detaliilor implementarii metodei si elementelor, afisand doar
functionalitatile sistemului.
 */


// Interface
/*  O interfață ( INTERFACE ) este un model de clasă
    Intergfata contine metode abstracte ( de asemeni accepta metode default )
    O metodă abstractă este o metodă care conține definiții, dar nu corpuri
    Metodele din interfete sunt publice
    Intefetele suporta functia de mostenire multipla
    Puteam  sa definim intefete utilizand cuvantul cheie INTERFACES
    O clasa extinde o alta clasa , o intefata extinde o alta interfata dar o clasa implementeaza o interfata
    Putem crea OBJECT pentru interfete, dar nu putem sa instantieom o interfata.


    class C1
    {
    Variables
    methods
    void met()          // este default
    {
    //code
    }
    }


    interface i1
    {
    Variables
    methods
    m();
    }

void met();         - abstract method ( no implementation )

Gradele de accesare sunt:
PUBLIC
DEFAULT
PROTECTED
PRIVATE

 */

/*
Exemplu :
Se vor crea mai multi copii si un singur parinte

interfata ABC
interfata XYZ

Clasa PQR

Clasa PQR implementeaza cele doua

 */


}
