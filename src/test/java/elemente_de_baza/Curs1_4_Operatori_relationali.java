package elemente_de_baza;

public class Curs1_4_Operatori_relationali {

    public static void main(String[] args) {

// Operatorii relationali, realizeaza comparatia intre operanzi
// Definim 2 variabile de tip INT:

        int s = 7;
        int t = 9;
//  varianta MAI MIC
        System.out.println(s < t );
//  varianta MAI MIC SAU EGAL
        System.out.println(s <= t );
//  varianta MAI MARE
        System.out.println(s > t );
//  varianta MAI MARE SAU EGAL
        System.out.println(s >= t );
/* Se observa ca primim ca raspuns valori de tip BOOLEAN
pt ca ea confirmare sau infirmare operatiei facute, ca e corecta sau nu.
*/

/* Operatori de logica:
    && - si
    || - sau
*/
        boolean var1 = (5 == 4 ) && ( 5 == 5 );
        System.out.println(var1);

        boolean var2 = ( 5 == 4 ) || ( 5 == 5);
        System.out.println(var2);
    }
}
