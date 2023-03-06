package elemente_de_teorie_5;

    class Testare1{
    static final void met1(){
        System.out.println("Este metoda met1 din class Testare1");
    }
    }

    class Testare2 extends Testare1{            // ne da eroare daca Testare1 este FINAL CLASS
        static void met2(){
            System.out.println("Este metoda met2 din class Testare2");
        }
    }


public class ClasaFinala1 {

    public static void main(String[] args) {
        Testare2 testare2 = new Testare2();

            System.out.println("");
        Testare1.met1();
            System.out.println("");
        Testare2.met2();
    }

}
