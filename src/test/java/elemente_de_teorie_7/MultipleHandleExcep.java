package elemente_de_teorie_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleHandleExcep {

    public static void main(String[] args) {

        System.out.println("Programul a pornit ... ");
        System.out.println("Programul este in derulare ....");

        Scanner scan3 = new Scanner(System.in);

        System.out.println("Introduceti un numar : ");
        int numar3 = scan3.nextInt();

        System.out.println("Am introdus numarul = " + numar3);

        try {

            System.out.println("Rezultatul impartirii este = " + 100 / numar3);
        } catch(ArithmeticException e){                                             // e it is autoamtic exception
            System.out.println("Valoare invalida, ArithmeticException");
            e.printStackTrace();
        }  catch(NumberFormatException e){                                             // e it is autoamtic exception
            System.out.println("Valoare invalida, NumberFormatException");
            e.printStackTrace();
        }  catch(NullPointerException e){                                             // e it is autoamtic exception
            System.out.println("Valoare invalida, NullPointerException");
            e.printStackTrace();
        } catch(InputMismatchException e){                                             // e it is autoamtic exception
            System.out.println("Valoare invalida, InputMismatchException");
            e.printStackTrace();
        }

        System.out.println("Programul e complet");
        System.out.println("Se iese din program");

    System.out.println("");

//  Incercam si cu un sir sa vedem care functie satisface cererea

        String sir4= "Bun venit";
        System.out.println(sir4.length());

        String sir5= null;
//        System.out.println(sir2.length());

/*  Pentru a elimina eroarea din linian 48 , care se comenteaza pentru a trece mai departe programul:
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "sir2" is null
	at elemente_de_teorie_7.MultipleHandleExcep.main(MultipleHandleExcep.java:48)
trebuie sa folosim un try-catch cu NullPointExceptions si avem comentariul
 */

        try{
            System.out.println(sir5.length());
        } catch(NullPointerException e){
            System.out.println("Valoare invalida, NullPointExceptions");
        }

    }
}
