package elemente_de_teorie_2;

//  Metoda 2 - CONSTRUCTOR
/*  Aceasta trebuie sa fie definita cu numele calsei, nu poate returna o valoare, nu specifica valoarea
, aceasta poate luata valoare parametrilor sau argumentelor, este chemata in mod automat cand cream obiectul
, se utilizeaza in special pentru initializarea valorilor variabilelor.
 */

public class Constructor2 {

    int x, y;
    String S;

    // Metoda 2
    Constructor2(int a, int b, String str){   //  aici definim constructorul dar parametrizat
        x=a;
        y=b;
        S= str;
    }


    void  displayData(){                    //  aici avem variabilele pentru tiparire
        System.out.println(x);
        System.out.println(y);
        System.out.println(S);

    }

    public static void main(String[] args) {
        Constructor2 constr = new Constructor2( 10, 20, "Salut numerelor x si y");
        constr.displayData();

    }

}




