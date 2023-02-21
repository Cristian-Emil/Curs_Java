package elemente_de_teorie_3;

// import static elemente_de_teorie_3.Static.*;

public class StaticMain {

    public static void main(String[] args) {
// metoda statica paote accesa elementele direct
        System.out.println(Static.a);
//        System.out.println(y);    // vedem ca ne da eroare, varaibila non-statica nu se poate accesa direct
        Static.meth1();;
//        metoda2();                   // vedem ca ne da eroare, metoda non-statica nu se paote accesa direct

        System.out.println("");

// Pentru elementele NON-STATIC trebuie sa definim un OBJECT

        Static metoda2 = new Static();
        System.out.println(metoda2.b);
        metoda2.meth2();;

        System.out.println("");
        metoda2.meth3();
//  Se vede ca prin met3 accesam toate elementele statice si non-statice.
//  Asta pt ca a, definit un OBJETC care sa fie apelat prin metoda PSVM - public static void main de ami sus
    }



}
