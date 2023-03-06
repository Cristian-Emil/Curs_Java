package elemente_de_teorie_8;

public class Collection {

// COLLECTION
/*
Colecție - reprezinta un grup de elemente/obiect/date într-o singură entitate, cumuleaza mai multe
elemente.
Elementele pot fi de orice tip, inclusiv alte obiecte.
Colectiile sunt folosite pentru a stoca, prelua, manipula si organiza datele intr-o maniera structurata.

Collection este o interfata care este disponibila in java.util package....si reprezinta :
Lista: O colectie ordonata de elemente care permite duplicate. ( LIST )
Set: O colectie de elemente care nu permite duplicate. ( SET )
Harta: o coleccie de perechi cheie-valoare. ( MAP )
Coada: O colectie care comanda elemente iuntr-o maniera FIFO (primul intrat, primul ieșit). ( QUEUE )

Colectiile in Java sunt extrem de personalizabile si pot fi extinse pentru a se potrivi cerintelor
specifice. De exemplu, clasa ArrayList extinde interfaaa List si ofera o matrice redimensionabila
care poate fi utilizata pentru stocarea și manipularea datelor.
In general, colectiile sunt o parte importanta a programarii Java si sunt utilizate pe scara larga
in multe aplicații.
 */

// MATRICEA - ARRAY
/*
Marimea matricelor este fixa
Nu sunt permise date eterogene - datele eterogene sunt un amestec de date din două sau mai multe surse,
de multe ori două sau mai multe formate, de exemplu, SQL si XML

int a; - acesta este un model de variabila

Collection pot sa fie implementate prin doua interfete - SET si LIST
COLLECTION(I)
LIST(I)     - ArrayList(C)
SET(I)      - HashSet(C)

MAP(I)      - HashMap(C)

LIST este o intefata
ArrayList este o clasa

ArrayList - is class implemented List interface.
ArrayList este o clasă în Java care implementeaza interfata List, ceea ce inseamna ca furnizeaza toate metodele
specificate de interfata List.
Interfata List din Java face parte din Java Collections Framework si defineste o colectie care este ordonata si
permite elemente duplicate. ArrayList ofera o implementare a matricei redimensionabile a acestei interfete, ceea ce
inseamna ca poate creste sau micsora dimensiunea ei in mod dinamic dupa cum este necesar ( scadere sau adaugare de
elmente in cadrul matircei ).
Unele dintre metodele comune furnizate de interfata List si implementate de ArrayList includ, printre altele, add,
remove, get, set, size, contains, indexOf și lastIndexOf. Aceste metode va permit sa manipulați continutul listei
si sa efectuati diferite operatii, cum ar fi adaugarea, eliminarea si preluarea elementelor, cautarea elementelor
si multe altele.

1)  Heterogens data     - allowed / permise
2)  Insertion order     - preserved ( Index )
3)  Duplicate elements  - allowed / permise
4)  Multiple nulls      - allowed / permise

Verifica si ruleaza "class ArrayList" pt a intelege cum lucreaza aceasta

 */


//  HashSet
/*
HashSet - is class implemented Set interface
HashSet este o clasa care implementeaza interfața Set în Java. HashSet este o clasa de colectie care va permite sa
stocati un set de elemente unice fara o anumita ordine. Este implementata folosind o structura de date de tabel hash,
care ofera timpi de acces rapid și de recuperare pentru elemente.
Interfața Set din Java specific faptul ca o colectie nu trebuie sa conțina elements duplicats. HashSet asigura acest
lucru prin utilizarea codului hash al elementelor pentru a le stoca si a le prelua. In plus, HashSet permite elemente
nule, dar numai un element nul poate fi stocat într-un HashSet la un moment dat.
In general, HashSet este o clasa utila in Java pentru stocarea și lucrul cu elemente unice dintr-o colectie.

1)  Heterogens data     - allowed / permise
2)  Insertion order     - Not preserved ( Index not supported )
3)  Duplicate elements  - Not allowed / nu sunt permise
4)  Multiple nulls      - Not allowed, only single null is allowed / nu sunt permise, este permis un singur nul la un
                          anumit moment

Verifica si ruleaza "class HashSet" pt a intelege cum lucreaza aceasta

 */


//  HashMap
/*
HashMap - is a class what implemented a Map interface
HashMap este o clasa in Java care implementeaza interfața Map, care ofera o modalitate de a stoca perechi cheie -
valoare intr-o colectie. Intr-un HashMap, cheile si valorile pot fi de orice tip de obiect, iar cheile trebuie sa fie
unice. Clasa HashMap foloseste o structura de date tabel hash pentru a stoca perechile cheie-valoare, ceea ce permite
accesul in timp real și permite recuperarea elementelor. Acest lucru o face o structura de date foarte eficienta pentru
anumite cazuri de utilizare, cum ar fi atunci cand trebuie sa efectuati cautari sau inserari in timp scurt sau foarte
rapid.

1)  Data can be stored in the form of key , value pairs / Datele pot fi stocate sub formă de perechi cheie, valori
2)  Key is unique. But we can have duplicate value / Perechea este unică. Dar putem avea o valoare duplicat.
3)  Insertion order is not preserved ( index not followed ) / Ordinea de inserare nu este păstrată (indexul nu este urmat)

Verifica si ruleaza "class HashMap" pt a intelege cum lucreaza aceasta

 */

}
