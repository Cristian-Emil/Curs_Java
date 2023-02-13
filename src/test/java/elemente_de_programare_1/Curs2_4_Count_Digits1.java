package elemente_de_programare_1;

public class Curs2_4_Count_Digits1 {

    public static void main(String[] args)

    {
        long n = 123456789;
        System.out.print("Number of digits = " + countDigits(n));
    }

    static int countDigits(long n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
//  CONTORIZAM NUMARUL DE ELEMENTE DIN SIRUL DAT - rezultatul este afisat pe ecran

    }
}
