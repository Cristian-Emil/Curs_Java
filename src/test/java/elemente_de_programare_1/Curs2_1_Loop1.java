package elemente_de_programare_1;

public class Curs2_1_Loop1 {

    public static void main(String[] args) {
//  Tiparim numerele de la 1 la 10 folosind functia WHILE

        int i1 = 1;
        while (i1<=6)
        {
            System.out.println(i1);
            i1++;
        }

//  Tiparim un rand liber
        System.out.println("");

//  Tiparim numerele de la 7 la 1 folosind functia WHILE
        int i2 = 7;
        while (i2 >= 1) {
            {
                System.out.println(i2);
            }
            i2--;
        }
        System.out.println("");

//  Si acelasi tip de exercitiu se poate face cu DO, WHILE
        int i3 = 6;

        do {
            System.out.println(i3);
            i3--;
        } while (i3 >= 1);
        System.out.println("");

//  Tipariti de 5 ori linia "Salut" si cifra curenta folosind functia WHILE
        int j = 1;
        while (j<=5)
        {
            System.out.println("Salut " +j);
            j++;
        }
        System.out.println("");

//  Tiparim numerele pare de la 1 la 10 folosind functia WHILE

        int k = 1;
        while (k<=5)
        {
            System.out.println("k = " +(k*2));
            k++;
        }

        System.out.println("");
//  Tiparim numerele impare de la 1 la 10 folosind functia WHILE

        int l = 0;
        while (l<5)
        {
            System.out.println("l = " + (l*2+1));
            l++;
        }

        System.out.println("");
//  Tiparim numerele pare de la 1 la 5 mai mari sau egale ca 0 folosind functia WHILE

        int m = 0;
        while (m<=5)
        {
            System.out.println("m = " +m);
            m+=2;
        }

        System.out.println("");
//  Tiparim numerele impare de la 1 la 5 mai mari ca 0 folosind functia WHILE

        int n = 0;
        while (n<5)
        {
            System.out.println("n = " +(n+1));
            n+=2;
        }

    }

}
