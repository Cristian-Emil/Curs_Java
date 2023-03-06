package elemente_de_teorie_8;

public class HashSet {

    public static void main(String[] args) {

//  Declaram obiectul HashSet cu importul din lava.utils.HashSet
        java.util.HashSet setulMeu = new java.util.HashSet<>();


//  Sau avem varianta in care specificam tipul care este definit - aici String - daca importam java.utils.HashSet
//        HashSet <String> setulMeu = new HashSet<String>();

//  Declararea variabilelor pentru HashSet

        setulMeu.add(100);
        setulMeu.add(10.5);
        setulMeu.add("Bun venit");
        setulMeu.add(null);
        setulMeu.add(100);
        setulMeu.add(null);

        System.out.println(setulMeu);
        System.out.println(setulMeu.size());

/*  Cand tiparim se observa ca nu accepta elemente duble ca in cazul ArrayList.
  Ne spune numarul de elemente o singura data. Chiar daca ele sunt de mai multe ori, sistemul nu le ia o singura data
 */


        System.out.println("");
//  ELIMINAREA unui element din lista
        setulMeu.remove(100);
        System.out.println("Dupa eliminare avem = \n" + setulMeu);

/*  Deci aici nu indicam pozitia care trebuie eliminata, sistemul o elimina cand o intalneste si pe restul de aceeasi
forma nu le considera
 */


        System.out.println("");
//  ADAUGAREA unei valori in cadrul setului
/*  Nu se poate INSERA o valoare, se poate doar adauga. Sistemul o sa adauge valoarea unde se poate in sirul definit
    anterior, considerand ultima lista pe care o are ( in cazul nostru dupa eliminarea valorii 100 )
*/

        setulMeu.add(50);
        System.out.println("Dupa adaugare avem = \n" + setulMeu);

        System.out.println("");         //  o sa afiseze elementele in coloana
        for(Object x:setulMeu){
            System.out.println(x);
        }







    }
}
