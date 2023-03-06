package elemente_de_teorie_7;

import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        System.out.println("Programul a pornit ... ");
        System.out.println("Programul este in derulare ....");

//  Exemplul 1:
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Introduceti un numar : ");
        float numar1 = scan1.nextInt();                   // utilizam "double" sau "float"

//  Tiparim numarul dorit si impartim 100 la numarul dorit
        System.out.println("Am introdus numarul = " + numar1);
        System.out.println("Rezultatul impartirii este = " + 100/numar1);

        System.out.println("Programul e complet");
        System.out.println("Se iese din program");

/* daca din eroare in loc de 10 scrie 0 ( ZERO ) atunci sistemul ne da un semnal si ne afiseaza:

Rezultatul impartirii este = Infinity                               ------> daca valoarea "numar" este DOUBLE sau FLOAT

sau

Am introdus numarul = 0
Exception in thread "main" java.lang.ArithmeticException: / by zero ----->  daca valoarea "numar" este INT
	at elemente_de_teorie_7.Exceptions.main(Exceptions.java:19)
 */

        System.out.println("");

//  Exemplul 2:

        int a[] = new int[5];   // avem valorile de la 0 la 4
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Introduceti un numar = ");
        int numar2 = scan2.nextInt();

        System.out.println("Introduceti numarul (0-4) = ");
        int poz = scan2.nextInt();

        a[poz] = numar2;            // ArrayIndexOutBoundsException

        System.out.println("Programul e complet, nu avem eroare");
        System.out.println("Se iese din program");

/*  Am introdus numarul = 6
    Si am primit exceptia urmatoare:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
	at elemente_de_teorie_7.Exceptions.main(Exceptions.java:47)
 */

        System.out.println("");

//  Exemplul 3:

        String s1 = "1234567";
        int numar3 = Integer.parseInt(s1);
        System.out.println(numar3);

        System.out.println("Am tiparit numarul ,deci programul e complet");
        System.out.println("Se iese din program");

//  Daca in loc de numarul "1234567" punem "BUNA" o sa avem eroare si ne da exceptia din linia 63:
/*        Exception in thread "main" java.lang.NumberFormatException: For input string: "BUNA"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:665)
        at java.base/java.lang.Integer.parseInt(Integer.java:781)
        at elemente_de_teorie_7.Exceptions.main(Exceptions.java:63)
 */


    }
}
