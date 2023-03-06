package elemente_de_teorie_7;

public class AllGeneralExceptions {

    public static void main(String[] args) {

        String sir6= "Bun venit";
        System.out.println(sir6.length());

        String sir7= null;
        int numar8= 0;          // daca punrm FLOAT sau DOUBLE ne da mesaj ca avem valoare INFINITY

        try{
            System.out.println(sir7.length());
        } catch(Exception e){
            System.out.println("Valoare invalida, Exception");
        }

        System.out.println("");

        try {
            System.out.println("Rezultatul impartirii este = " + 100 / numar8);     // ArithmeticException
        } catch(ArithmeticException e){                                             // e it is autoamtic exception
            System.out.println("Ai introdus o valoare invalida, ArithmeticException");
            e.printStackTrace();
        }
        finally{
            System.out.println("Intram in block-ul de inchidere ");
        }

        System.out.println("Programul e complet");
        System.out.println("Se iese din program");

/* Aceasta linie de comanda ne arunca toate exceptiile intalnite pe carcurs dar nu tipareste si nu ofera informatii
despre exceptiile intalnite. Este o exceptie generala.
 */

    }
}
