package elemente_de_teorie_7;

import java.util.Scanner;

public class HandleExceptions {

    public static void main(String[] args) {
        System.out.println("Programul a pornit ... ");
        System.out.println("Programul este in derulare ....");

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Introduceti un numar : ");
        int numar1 = scan1.nextInt();

        System.out.println("Am introdus numarul = " + numar1);
        System.out.println("Rezultatul impartirii este = " + 100 / numar1);   // ArithmeticException

        System.out.println("Programul e complet");
        System.out.println("Se iese din program");

//  Daca se introduce ZERO o sa avem exceptia :
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at elemente_de_teorie_7.HandleExceptions.main(HandleExceptions.java:17)
Altfel , pentru orice alt numar avem raspuns normal si poztiv.
*/

        System.out.println("");

//Ca sa manageriem acesta exceptie - pentru cifra 0 ) o sa introducem blocul TRY - vezi mai jos:
        System.out.println("Aici incepe partea cu TRY ... CATCH");
        System.out.println("");
        System.out.println("Programul a pornit ... ");
        System.out.println("Programul este in derulare ....");

        Scanner scan2 = new Scanner(System.in);

        System.out.println("Introduceti un numar : ");
        int numar2 = scan2.nextInt();

        System.out.println("Am introdus numarul = " + numar2);

        try {
            System.out.println("Rezultatul impartirii este = " + 100 / numar2);     // ArithmeticException
        } catch(ArithmeticException e){                                             // e it is autoamtic exception
            System.out.println("Ai introdus o valoare invalida, ArithmeticException");
            e.printStackTrace();
        }

        System.out.println("Programul e complet");
        System.out.println("Se iese din program");

//  La rularea programului , linia 46 ne da mesajul
/*
java.lang.ArithmeticException: / by zero
	at elemente_de_teorie_7.HandleExceptions.main(HandleExceptions.java:46)

 Si ne anunta ca avem o exceptie in acel punct.
 */
    }
}
