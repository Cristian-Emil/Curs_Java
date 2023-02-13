package elemente_de_programare_2;

import java.util.Scanner;

public class Curs3_1_Count_Digits1 {

    public static void main(String[] args) {

//  Citim numarul de cifre din numarul intrudus la tastatura
//  Exercitiul anterior doar ca folosim functia SCANNER sa citim numarul introdus de la consola

        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println("Number of digits in the entered integer are :: "+count);


    }





}
