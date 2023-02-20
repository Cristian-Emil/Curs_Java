package elemente_de_programare_1;

public class Curs2_2_Break_Continue {

    public static void main(String[] args) {

//  Sistem iterativ cu comanda FOR, IF si BREAK

        for (int i=1; i<=6; i++)
        {
            if (i==5)
            {
                break;
            }
            System.out.println(i);
        }
/*  Sistemul tipareste valorile pana ajunge la valoarea indicata in conditia IF
    si cand da de conditia BREAK atunci opreste iteratia.
 */
        System.out.println("");
//  Sistem iterativ cu comanda FOR, SWITCH, CASE and BREAK

            for( int zileSaptamana = 1; zileSaptamana <= 5; zileSaptamana++ )

            switch(zileSaptamana)
            {
                case 1: System.out.println("Luni"); break;
                case 2: System.out.println("Marti"); break;
                case 3: System.out.println("Miercuri"); break;
                case 4: System.out.println("Joi"); break;
                case 5: System.out.println("Vineri"); break;
                case 6: System.out.println("Sambata"); break;
                case 7: System.out.println("DuminicaMul"); break;
            }
//  BREAK opreste execvutia comenzii la pasul dupa care este scris
        System.out.println("");
//  Sistem iterativ cu comanda FOR, IF si CONTINUE , cu saltul peste un element

        for (int j=1; j<=7; j++)
        {
            if (j==4)
            {
                continue;
            }
            System.out.println(j);
        }
/*  Sistemul tipareste valorile pana la valoarea indicata in conditia initiala.
    CONTIUNUE ii spune sa mearga mai departe dupa ce da de elementul conditional peste care sare
*/
        System.out.println("");
//  Sistem iterativ cu comanda FOR, IF si CONTINUE cu saltul peste mai multe elemente
        for (int k=1; k<=10; k++)
        {
            if (k==3 || k==6 || k == 9)
            {
                continue;
            }
            System.out.println(k);
        }
/*  Sistemul tipareste valorile pana la valoarea indicata in conditia initiala.
    CONTIUNUE ii spune sa mearga mai departe dupa ce da de elementele conditionale peste care sare
*/
        System.out.println("");

    }

}
