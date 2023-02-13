package elemente_de_programare_2;

import java.util.Scanner;

public class Curs3_1_Count_Digits2 {
    public static void main(String[] args)
    {
        int num, totalDigits=0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        num = s.nextInt();

        while(num!=0)
        {
            totalDigits++;
            num = num/10;
        }

        System.out.println("\nThe Total Number of Digits = " +totalDigits);
    }



}
