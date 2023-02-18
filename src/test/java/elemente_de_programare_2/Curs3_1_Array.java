package elemente_de_programare_2;

import java.util.Arrays;

public class Curs3_1_Array {

    public static void main(String[] args) {
//  Definim o matrice coloana

    int a[] = {15, 30, 45 , 60};
        System.out.println("Numarul de elemente din matrice = " + a.length);
//  Ne tipareste numarul de elemente din linia matricei - 4 in acest caz
        System.out.println("");

        System.out.println("Valoarea elementului " +(2+1) + " din matrice = " + a[2]);
//  Ne tipareste valoarea pozitiei 3 din matrice - ATENTIE SISTEMUL CONTORIZEAZA DE LA ZERO
//  0 ESTE 15
//  1 ESTE 30
//  2 ESTE 35
//  3 ESTE 60
        System.out.println("");

        System.out.println("Matricea linie = " +Arrays.toString(a));
//  Se tipareste matricea complet - cu paranteze
        System.out.println("");

        for (int i=0; i<=3; i++ ){
            System.out.println("Elementul " +(i+1) + " are valoarea " + a[i]);
        }
//  Se tiparesc valorile elmentelor din matrice - metoda 1
        System.out.println("");

        for (int x:a ){
            System.out.println(x);
//  Se tiparesc valorile elmentelor din matrice - metoda 2

        }
    }
}
