package elemente_de_baza;
import java.util.Scanner;

public class Curs1_2_Neprimitive {

    public static void main(String[] args) {

/*  NEPRIMITIVE

    Daca facem o clasa de tip SCANNER, putem sa definim o variabila
    cu ce nume dorim noi ( aici scan ) si trebuie sa fie de tipul clasei definite ( aici SCANNER )
    Pentru exemplificare o sa folosin functia
    System.out.println("  ")
    ca sa tiparim ce dorim sa intyroducem la consola.
    Vezi exemplul de mai jos
 */

        String name = "text afisat";
        System.out.println(name.toUpperCase()); // este o neprimitiva care o sa tiparesca textul cu majuscule

        String prenume ="Eu";
        String nume ="InPersoana";
        System.out.println(prenume+ "_" + nume);
        // este o primitiva care afiseaza prenumele si numele pe o linie, separate de un underscore


        Scanner scan = new Scanner(System.in);
        System.out.println("Acesta este un numar introdus de la tastatura = ");
        int numar = scan.nextInt();
        System.out.println("Ai introdus numarul " + numar );
        // toate liniile formeaza o neprimitiva care afiseaza numarul introdus de la tastatura

    }

}



