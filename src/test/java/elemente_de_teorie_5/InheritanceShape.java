package elemente_de_teorie_5;

interface Forma {
    int Length = 15;    //  acesta este FINAL si STATIC. Nu este nevoie sa-l specificam
    int width = 25;     //    acesta este FINAL si STATIC. Nu este nevoie sa-l specificam

    void cerc();        //  metoda abstracta - neimplementata

    default void suprafata(){
        System.out.println("Aceasta este suprafata - este o metoda DEFAULT");
    }

    static void rectangulara(){
        System.out.println("Aceasta este rectangulara - este o metoda STATICA");
    }
}


public class InheritanceShape implements Forma{

    public void cerc(){
        System.out.println("Acesta este un cerc");
    }


    public static void main(String[] args) {
        InheritanceShape ID_obj = new InheritanceShape();

        ID_obj.cerc();
        ID_obj.suprafata();

        Forma.rectangulara();   //  "static methode" pot sa fie accesate direct

//      Putem crea OBJECT pentru interfete, dar nu putem sa instantieom o interfata.

//        Forma sprf = new Forma();              // este forma incorecta
        Forma sprf = new InheritanceShape();     // este forma corecta pentru accesare

        sprf.cerc();
        sprf.suprafata();

    }



}
