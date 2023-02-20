package elemente_de_teorie_2;

public class SalutareMain {

    public static void main(String[] args) {

// Aceasta e metoda 1
        Salutare salut = new Salutare();
        salut.salutare1();

        System.out.println("" );        // tiparim un rand liber
// Aceasta e metoda 2
        String salve2 = salut.salutare2();
        System.out.println(salve2);

        System.out.println("" );        // tiparim un rand liber
// Aceasta e metoda 3
        salut.salutare3("Costica");

        System.out.println("" );        // tiparim un rand liber
// Aceasta e metoda 4
        String salve4 = salut.salutare4("Constantin");
        System.out.println(salve4);



    }

}
