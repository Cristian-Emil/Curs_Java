package elemente_de_teorie_3;

public class Static {

    static int a= 101;              // variabila static
    int b = 201;                    // variabila non-static

    static void meth1(){             // metoda statica
        System.out.println("Metoda 'met1' este statica");
    }

    void meth2(){                    // metoda non-statica
        System.out.println("Metoda 'met2' nu este statica, deci am definit un OBJECT");
    }

    void meth3(){                     // metoda non-statica
        System.out.println(a);
        System.out.println(b);

        meth1();;;
        meth2();;
    }


}
