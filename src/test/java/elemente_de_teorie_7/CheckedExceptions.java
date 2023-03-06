package elemente_de_teorie_7;

import java.util.Scanner;

public class CheckedExceptions {

    public static void main(String[] args)  {
        System.out.println("Programul a pornit ... ");
        System.out.println("Programul este in derulare ....");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e){
                    e.printStackTrace();
                }

        System.out.println("Programul e complet");
        System.out.println("Se iese din program");

/*  In cazul in care nu punem conditia din catch ( InterruptException e) atuinci o sa avem in linia 5
un argument de genul:
    public static void main(String[] args) throws InterruptedException { .... }

 Acesta ne realizeaza exceptia de a avea un numar de milisecunde ( aici 5000 = 5 secunde ) timp de
 asteptare care este impus din blocul de comanda.
 */

    }
}
