package elemente_de_baza;

public class Curs1_3_Operatori_simpli {
    public static void main(String[] args) {

//  Putem sa facem direct o operatie matematica ( cu operatori matematici ) si sa tiparim valoarea finala

//  Adunare
        System.out.println(5+4);

//  Scadere
        System.out.println(5-4);

//  Inmultire
        System.out.println(5*4);

//  Impartire
        System.out.println(5/2);
// o sa returneze doar valoarea intreaga rezultatat in urma impartirii lui 5 la 2 adica 2

// Incrementarea
        int p =8;
        System.out.println("Afisam p = " +p);
        p++;
        System.out.println("Afisam valoarea incrementata cu 1, p = " +p);

// Decrementarea
        int r =7;
        System.out.println("Afisam r = " +r);
        r--;
        System.out.println("Afisam valoarea decrementata cu 1, r = " +r);

//  Adumare, scadere si tiparirea textului de comentat pt operatiile simple:

        System.out.println("Suma numerelor 'p' si 'r' este = " + (p+r));  // Afiseaza suma celor 2 numere

        System.out.println("Diferenat numerelor 'p' si 'r' este = " + (p-r));  // Afiseaza diferenta celor 2 numere

        System.out.println("Produsul numerelor 'p' si 'r' este = " + (p*r));  // Afiseaza rezultatul inmultirii celor 2 numere

        System.out.println("Impartirea numerelor 'p' si 'r' este = " + (p/r) + " .... fara zecimale pt ca nu a fost definit ca float");
        // Afiseaza rezultatul impartirii celor 2 numere ca valoare intrega, fara zecimale ( pt ca nu a fost definit ca float )


/*  ATENTIE : JAVA EXECUTA COMNEZILE LINIE CU LINIE DECI VALORILE PENTRU 'p' SI 'r' SUNT CELE CARE REZULTA DUPA
    EXECUTAREA PRIMELOR LINII DE COMANDA SI NU CELE DEFINITE ANTERIOR.
*/

    }

}





