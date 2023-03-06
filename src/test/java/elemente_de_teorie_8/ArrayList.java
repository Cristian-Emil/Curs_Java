package elemente_de_teorie_8;


public class ArrayList {

    public static void main(String[] args) {

//  Declaram obiectul ArrayList cu importul din java.utils.ArrayList
        java.util.ArrayList listaMea = new java.util.ArrayList();

//  Sau avem varianta in care specificam tipul care este definit - aici String - daca importam  java.utils.ArrayList
//        ArrayList<String> listaMea = new ArrayList<String>();


//  adaugarea de data element in ArrayList

        listaMea.add(100);
        listaMea.add(10.5);
        listaMea.add("Bun venit");
        listaMea.add(null);
        listaMea.add(100);
        listaMea.add(null);

//  In lista putem sa depozitam primitive. Acolo ele pot sa fie puse ( store )


        System.out.println(listaMea.size());

        System.out.println("Lista initiala cu 6 elmente");
        System.out.println(listaMea);

//  Eliminarea unui element
/*  Daca dorim sa eliminam un element din lista atunci trebuie sa specificam pozitia acestuia. Numaratoarea incepe
de la 0 ( ZERO )
*/
        System.out.println("");
        listaMea.remove(0);
        System.out.println("Dupa ce am eliminat primul element  \n" + listaMea);
//  Se tipareste lista fare primul element, deci cu 5 elemente

        System.out.println("");
        listaMea.remove(4);
        System.out.println("Dupa ce am eliminat ultimul element  \n" + listaMea);
/*  Se tipareste lista fare ultimul element, atentie ca primul element a fost eliminata deci acum avem lista cu 5
    elemente din care mai eliminam un element.
    Deci la final ne raman 4 elemente
 */

//  Adaugarea unui element
/*  Daca dorim sa adaugam un element in lista atunci trebuie sa specificam pozitia acestuia. Numaratoarea incepe
de la 0 ( ZERO ) si noi trbuie sa specificam pozitia unde il inseram
Add fara pozitie specificata se numeste ADAUGARE si se face la finalul liste, add cu valoare specificat se numeste
INSERARE iar marimea este pusa in pozitia specificata.
 */
        System.out.println("");
        listaMea.add(3, "Curs Java");       // Am adaougat pe pozitia a patra textul "Curs Java"
        System.out.println("Dupa ce am adaugat un element  \n" + listaMea);

//  Daca nu specificam pozitia pe care inseram valoarea atunci ea este inserata la finalul listei adica este adaugata

// Capturarea unei valori din lista - GET
        System.out.println("");
        System.out.println(listaMea.get(2));

//  Am pus 2 deci o sa ia a 3 valoare din ULTIMA LISTA TIPARITA  ( pt ca incepe de la ZERO )


//  Cum citim toate elementele, valorile din lista desi avem valori si marimi diferite. Se creaza un OBJECT
        System.out.println("");

        System.out.println("Avem elementele afisate pe coloana: ");
        for (Object x:listaMea){
            System.out.println(x);
        }

//  Curatarea listei se face cu comanda CLEAR. Cu ea eliminam toate valorile din lista
        System.out.println("");

        listaMea.clear();                               // cu comanda CLEAR eliminam / stergem taote valorile din lista.
        System.out.println("Lista dupa ce am curatat = " + listaMea);
//  Se observa ca nu mai avem valori in lista.
    }
}
