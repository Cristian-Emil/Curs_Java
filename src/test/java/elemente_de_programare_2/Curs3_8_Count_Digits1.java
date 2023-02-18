package elemente_de_programare_2;

import java.util.Scanner;

public class Curs3_8_Count_Digits1 {

    public static void main(String[] args) {

//  Citim numarul de cifre din numarul intrudus la tastatura
//  Exercitiul anterior doar ca folosim functia SCANNER sa citim numarul introdus de la consola

        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Introduceti un numar de la tastatura :");
        int num = sc.nextInt();
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println("Numarul introdus este compus din " + count + " cifre");

    }
}
