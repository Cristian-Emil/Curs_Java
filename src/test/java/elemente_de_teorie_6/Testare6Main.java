package elemente_de_teorie_6;

public class Testare6Main extends Testare6{

// Pentru ca variabila "x" si metoda "met1" sunt private ele se pot accesa doar din clasa in care sunt
//  Celelate metode cum e "met3" se pot accesa in mod normal

    public static void main(String[] args) {
        Testare6 test = new Testare6();

//  Se vede ca variabila x si met1 nu pot sa fie accesate pt ca sunt PRIVATE
//        System.out.println(test.x);
//        test.met1();

//  Pentru a accesa metoda 2 este necesar sa folosium extinderea clasei Testare6 - EXTENDS
        System.out.println(test.y);
        test.met2();

        System.out.println(test.z);
        test.met3();

    }

}
