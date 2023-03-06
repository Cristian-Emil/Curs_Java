package elemente_de_teorie_8;

public class HashMap {

    public static void main(String[] args) {

//  Declaram obiectul HashMap cu importul din lava.utils.HashMap

        java.util.HashMap setul = new java.util.HashMap<>();

//  Sau avem varianta in care specificam tipul care este definit - aici Integer, String - daca importam java.utils.HashMap
//        HashMap <Integer, String> setul = new HashMap<Integer, String>();

//  Declararea variabilelor pentru HashMap

        setul.put(101, "Ion");
        setul.put(102, "Vasile");
        setul.put(103, "Bun venit");
        setul.put(104, "Ion");
        setul.put(105, "Mihaela");
        setul.put(101, "David");

        System.out.println(setul);  //
        System.out.println(setul.size());       // pentru contorizare numar elemente

//  Pentru valorile duplicate o sa ia ultima valoare intalnita pentru aceeasi CHEIE - aici 101.
//  Va contoriza doar valorile care nu sunt duplicat

        System.out.println("");
//  Pentru eliminarea unui element specificam indexul - CHEIA - deci avem :
        setul.remove (104);
        System.out.println("Dupa eliminarea elementului 104 avem = \n " + setul);

        System.out.println("");
//  Pentru tiparirea unui element anume specificam indexul - CHEIA - deci avem :
        System.out.println(setul.get(102));

        System.out.println("");
//  Pentru tiparirea CHEILOR avem :
        System.out.println("Doar cheile ");
        System.out.println(setul.keySet());

        System.out.println("");
//  Pentru tiparirea doar a valorilor avem nevoie sa definim un OBJECT:
        System.out.println("Doar valorile ");
        for (Object k:setul.keySet())
        {
            System.out.println(setul.get(k));
        }

        System.out.println("");
//  Pentru tiparirea valorilor si a cheilor avem nevoie sa definim un OBJECT:
        System.out.println("Cheile si valorile ");
        for (Object k:setul.keySet())
        {
            System.out.println( k + "       " + setul.get(k));
        }

    }
}
