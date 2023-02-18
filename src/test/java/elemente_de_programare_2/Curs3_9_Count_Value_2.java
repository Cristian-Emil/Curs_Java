package elemente_de_programare_2;

import java.util.Scanner;

public class Curs3_9_Count_Value_2 {

//  Aplicam varianta anterioara dar cu introducerea numerelor de la tastatura

    public static void main(String[] args) {
        long numar, suma;
        Scanner nr = new Scanner(System.in);
        System.out.println("Tastam un numar  = ");
        numar = nr.nextLong();

        for(suma=0;
            numar !=0;
            numar = numar/10)

        {
            suma = suma +numar%10;
        }
        System.out.println("Suma cifrelor este = " + suma);

    }

}
