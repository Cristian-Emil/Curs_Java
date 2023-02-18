package elemente_de_programare_2;

import java.util.Arrays;

public class Curs3_2_Array_Square {

    public static void main(String[] args) {
        int a[][] = new int[3][3];
        a[0][0] = 10;
        a[0][1] = 15;
        a[0][2] = 20;

        a[1][0] = 20;
        a[1][1] = 25;
        a[1][2] = 30;

        a[2][0] = 30;
        a[2][1] = 35;
        a[2][2] = 40;

        int i = 2;
        int j = 2;
        System.out.println(a.length);
//  Se tiparesc lungimea coloanei din matrice
        System.out.println("");

        System.out.println(a[0].length);
//  Se tiparesc lungimea primei linii din matrice
        System.out.println("");

        System.out.println(a[1][1]);
//  Se tiparesc elementul din linia 2 coloane 2 din matrice
        System.out.println("");

        System.out.println(a[i][j]);
//  Se tiparesc elementul din linia 3 coloane 3 din matrice a[2][2]
        System.out.println("");

        for (int i1 = 0; i1 <= 2; i1++) {
        for (int j1 = 0; j1 <= 2; j1++) {
                System.out.println(a[i1][j1]);
            }
        }
//  Se tiparesc toate elementul din matrice incepand cu linia 1 si terminand cu linia 3 puse in coloana in sir indian
        System.out.println("");

        for (int x[]:a)
        {
            for (int v:x)
            {
                System.out.println(v);
            }
            System.out.println();
        }
//  Se tiparesc toate elementul din matrice de la linia 1 pana la linia 3, elementele sunt in coloana cu spatiu intre grupe
        System.out.println("");

        for (int i2 = 0; i2 <a.length; i2++) {
            for (int j2 = 0; j2 < a[i2].length; j2++) {
                System.out.print(a[i2][j2]+"   ");
            }
            System.out.println();
        }
//  Se tiparesc toate elementul din matrice incepand cu linia 1 si terminand cu linia 3 - metoda 1
        System.out.println("");

        for (int i3 = 0; i3 <a.length; i3++) {
            for (int j3 = 2; j3 < a[i3].length; j3++) {
                System.out.print(Arrays.toString(a[i3]));
            }
            System.out.println();
        }
//  Se tiparesc toate elementul din matrice incepand cu linia 1 si terminand cu linia 3 , inclusiv parantezele - metoda 2

    }

}