package elemente_de_programare_1;

public class Curs2_1_Loop2 {

    public static void main(String[] args) {

//  Tiparim numerele pare care sunt mai mari ca 0 si mai mici sau egale cu 9 folosind functiile WHILE si IF

        int i = 2;
        while (i <= 9) {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
            i++;
        }

/*  WHILE LOOP
Trebuie sa indeplineasca sintaxa:
while(condition)
{
statements
inc/dec
}
 */
        System.out.println("");
//---------------------------------------------------------------------------------------------------------------------
//  Tiparim numerele impare care sunt mai mari ca 0 si mai mic sau egale cu 7 folosind functiile DO si WHILE

        int j = 1;
        do
        {
            System.out.println(2*j-1);
            j++;
        } while (j<=4);


/*  DO ... WHILE ( LOOP )
Trebuie sa indeplineasca sintaxa:
do
{
statements
inc/dec
} while(condition);
 */
        System.out.println("");
//----------------------------------------------------------------------------------------------------------------------
//  Tiparim numerele care sunt mai mari ca 0 si mai mic sau egale cu 0 folosind functiile FOR

    for( int k=1; k<=5; k++)
    {
        System.out.println(k);
    }

/*  FOR ( LOOP )
Trebuie sa indeplineasca sintaxa:
for (initialization; condition; inc/dec )
{
statements;
}
 */
        System.out.println("");
//----------------------------------------------------------------------------------------------------------------------
//  Tiparim numerele impare care sunt mai mari ca 0 si mai mic sau egale cu 5 folosind functiile FOR si IF

        for( int l=1; l<=5; l++) {
            if (l % 2 != 0) {
                System.out.println(l);
            }
        }
/*  FOR & IF ( LOOP )
Trebuie sa indeplineasca sintaxa:
for (initialization; condition; inc/dec ) {
if {
statements; }
}
 */
        System.out.println("");
//----------------------------------------------------------------------------------------------------------------------
//  Cum putem sa testam ca un LOOP functioneaza corect folosinf FOR si IF ? Alegem varianta "|| = SAU"

        for( int m=1; m<=9; m++) {
            if (m==2 || m==5 || m==9 || m==10 ) {
                System.out.println(m);
            }
        }

        System.out.println("");
//  Observam ca pentru valoarea m=10 nu se afisaeaza valoarea pt ca 10 nu este in intervalul 1-9:

//  Sau in cazul de negare al valorilor si alegem varianta "&& = SI"
        for( int n=1; n<=9; n++) {
            if (n!=2 && n!=5 && n!=9 && n!=10 ) {
                System.out.println(n);
            }
        }
//  Observam ca pentru valoarea m=10 nu se afisaeaza valoarea si la fel valorile negate din intervalul 1-9:
//  Deci sintaxa noastra LOOP cu FOR si IF functioneaza
        System.out.println("");
//----------------------------------------------------------------------------------------------------------------------

    }

}
