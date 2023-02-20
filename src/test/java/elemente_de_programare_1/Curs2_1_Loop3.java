package elemente_de_programare_1;

public class Curs2_1_Loop3 {

    public static void main(String[] args) {

//  Utilizan varianta in care definim un BOOLEAN aplicand functiile IF, FOR, ELSE

        boolean tricou = false;

        if (tricou) {
            for (int a = 1; a <= 5; a++) {
                System.out.println(a);
            }
        } else {
            for(int b=9; b>=1; b--) {
                System.out.println(b);
            }
        }
//  Daca "tricou = TRUE" afisam valorile "a", daca e FALSE atunci afisam valorile "b"

    }

}