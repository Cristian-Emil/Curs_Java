package elemente_de_teorie_2;

//  Metoda 1 - METHODE ,
/*  Aceasta poate sa fie definita cu orice nume, poate returna sau nu o valoare, daca nu returneaza valaore
atunci specificam VOID, aceasta poate luata valoare parametrilor sau argumentelor, o putem chema in mod explicit
prin metoda obiectelor, se utilizeaza pentru anumite cazuri specifice.
 */

public class Constructor1 {

    int x,y;
    String str;

//  Metoda 1
    Constructor1(){                          //  aici definim constructorul si valorile DEFAULT
        x=101;
        y=102;
        str="Bun venit numerelor x si y";
    }

    void  displayData(){                    //
        System.out.println(x);
        System.out.println(y);
        System.out.println(str);
    }

    public static void main(String[] args) {
        Constructor1 constr = new Constructor1();    // accesam constructorul DEFAULT pentru valorile existente
         constr.displayData();
    }

}
