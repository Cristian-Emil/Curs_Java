package elemente_de_teorie_3;

public class Static1 {

    static int x= 101;              // variabila static
    int y = 201;                    // variabila non-static

    static void met1(){             // metoda statica
        System.out.println("Metoda 'met1' este statica");
    }

    void met2(){                    // metoda non-statica
        System.out.println("Metoda 'met2' nu este statica, deci am definit un OBJECT");
    }

    void met3(){                    // metoda non-statica
        System.out.println(x);
        System.out.println(y);

        met1();
        met2();
// Metodele non-statice pot accesa orice in mod direct .
    }

    public static void main(String[] args) {
// metoda statica paote accesa elementele direct
        System.out.println(x);
//        System.out.println(y);    // vedem ca ne da eroare, varaibila non-statica nu se poate accesa direct
        met1();;
//        met2();                   // vedem ca ne da eroare, metoda non-statica nu se paote accesa direct

        System.out.println("");

// Pentru elementele NON-STATIC trebuie sa definim un OBJECT

        Static1 metoda2 = new Static1();
        System.out.println(metoda2.y);
        metoda2.met2();

        System.out.println("");
        metoda2.met3();
//  Se vede ca prin met3 accesam toate elementele statice si non-statice.
//  Asta pt ca a, definit un OBJETC care sa fie apelat prin metoda PSVM - public static void main de ami sus
    }



}
