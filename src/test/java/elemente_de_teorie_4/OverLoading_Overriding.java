package elemente_de_teorie_4;

class A1{
    void metoda1( int a){
        System.out.println("Valoare lui a = " +a);
    }
    void metoda2( int b){
        System.out.println("Valoare lui b = " + b);
    }
}

class A2 extends A1{                    // aceatsa este METODA OVERRIDED pentru ca am definit in metoda 1 pe a si am scris a*a
    void metoda1( int a){
        System.out.println("Avem rezulatatul inmultirii lui a cu el insusi = " +(a*a));
    }
    void metoda2( int a, int b){        //  aceasta este METODA OVERLOADED pentru ca an scris metoda 2 pt b dar am incarcat a+b
        System.out.println("Avem rezulatatul adunarii lui a cu b = " + (a+b));
    }
}


public class OverLoading_Overriding {
    public static void main(String[] args) {
        A2 a2 = new A2();
        a2.metoda1(101);
        System.out.println("");
        a2.metoda2(201);
        System.out.println("");
        a2.metoda2(102,202);

/*  Deci rezulta ca avem definitye 3 metode in loc de 2 cate au fost initial.
Observam ca METODA 2  apare atat cu 1 parametru cat si cu 2.
Deci dupa ce executa prima comanda avem overloading peste metoda initiala si rezulta adunarea.
 */

    }
}
