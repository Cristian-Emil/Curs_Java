package elemente_de_teorie_2;

public class Curs_Methode_Constr_Polym {

//  Defimin variantele in class Saluatre si SalutareMain -
/*  Avem cele 4 variante:
1)  nu avem paramtru' , nu returnam valaore.
2)  nu avem parmatru' dar returnam valoare specificata in metoda
3)  avem parametru' dar nu returnam valoare, valoare acestuia se defineste cand editam NUME
4)  avem parmatru' SI returnam valoarea pe care e definita in metoda

 */


//  Avem cazurile Constructor 1 si Constructor 2
/*
1) utilizarea unei METHOD
2)  Utilizarea unui CONSTRUCTOR

 */


//  Avem cazul Polymorphism
/*
Prin aceasta metoda putem sa suprascriem anumite valori si parmatrii

EXEMPLU:

varianta generala fara sa dedicam elementele adaugate
add ( 11, 22 )
add ( 11, 22, 33 )

si varianta speciala unde dedicam elementele adaugate

add doua_numere ( 11, 22 )
add trei_numere ( 11, 22, 33 )

Prim prima metoda incarcam mai multe variante prin chemarea unei singure functii- POLIMORFISM.
In metoda doi trebuie sa chemam fiecare element in parte, in mod special.

Vezi class MetodaSuprainc ca exemplu




La fel se paote vedea in ConstrSuprainc cum se supraincarca anumite valori si se utilizeaza cel
care au fost definite anterior doar prin simpla apelare a valorilor intregi sau cu virgula
Vezi class ConstrSuprainc ca exemplu


In Class Referinta se arata cum putem sa definim 2 metode
In azul 2 daca puneam X=X si Y=Y se afisau valorile 0.0 si 0.0
Folosind sintaxa THIS atunci putem sa avem exact acelasi rezultat ca in prima metoda.

 */


}
