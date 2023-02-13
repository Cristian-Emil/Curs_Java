package elemente_de_programare_1;

public class Curs2_3_Reverse_number {

    public static void main(String[] args) {
//  Avem programul de tiparire a unui numar de la coada la cap folosim WHILE si REVERSED
        System.out.println("Aceasta este varianta 1 - bucle separate");

        System.out.println("Prima bucla");
        int num1 = 1357, reversed1 = 0;
        System.out.println("Original Number: " + num1);
//  Rulam prima bucla pana ultimul numar este 0
        while(num1 != 0) {

//  Inmultim numarul cu 10 ca ultimul digit sa fie 10
            int digit = num1 % 10;
            reversed1 = reversed1 * 10 + digit;

//  eliminam ultimul digit din numar ca sa avem valoarea initiala
            num1 /= 10;
        }
        System.out.println("Reversed Number: " + reversed1);

    System.out.println("");
        System.out.println("A doua bucla");
        int num2 = 8642, reversed2 = 0;
        System.out.println("Original Number: " + num2);
//  Rulam a doua bucla pana ultimul numar este 0
        while(num2 != 0) {

//  Inmultim numarul cu 10 ca ultimul digit sa fie 10
            int digit = num2 % 10;
            reversed2 = reversed2 * 10 + digit;
//  eliminam ultimul digit din numar ca sa avem valoarea initiala
            num2 /= 10;
        }
        System.out.println("Reversed Number: " + reversed2);

        System.out.println("");
//  Elementele buclelor se pot conmbina astfel incat sa afiseze valorile in mod diferit
        System.out.println("Aceasta este varianta 2 - bucle incrucisate");

        System.out.println("Elemenetele pentru cele 2 bucle");
        int num3 = 1357, reversed3 = 0;
        System.out.println("Original Number: " + num3);
        int num4 = 8642, reversed4 = 0;
        System.out.println("Original Number: " + num4);

        System.out.println("");
//  Prima bucla
        System.out.println("Prima bucla");
        while(num3 != 0) {
            int digit = num3 % 10;
            reversed3 = reversed3 * 10 + digit;
            num3 /= 10;
        }
        System.out.println("Reversed Number: " + reversed3);

//  A doua bucla
        System.out.println("A doua bucla");
        while(num4 != 0) {
            int digit = num4 % 10;
            reversed4 = reversed4 * 10 + digit;
            num4 /= 10;
        }
        System.out.println("Reversed Number: " + reversed4);
    }

}
