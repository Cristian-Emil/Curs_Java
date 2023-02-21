package elemente_de_teorie_2;

public class ConstrSuprainc {

    int x, y, z;
    double d1;

//  Avem metoda OVERLOADING a valorilor pentru diversi CONSTRUCTOR -----------------------------------------------------

    ConstrSuprainc(){                                   //  Metoda 1
        x=101;
        y=102;
        z= 103;
        d1 = 9.5;
    }

    ConstrSuprainc(int a, int b){                       //  Metoda 2
        x=a;
        y=b;
    }

    ConstrSuprainc(int a, double b){                    //  Metoda 3
        y=a;
        d1=b;
    }

    ConstrSuprainc( double b, int a){                   //  Metoda 4
        z=a;
        d1=b;
    }


    void display(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(d1);
    }


    public static void main(String[] args) {
        ConstrSuprainc constr1 = new ConstrSuprainc();
        constr1.display();                               //  este pentru Metoda 1
        System.out.println("");

        ConstrSuprainc constr2 = new ConstrSuprainc(101, 102);
        constr2.display();                               //  este pentru Metoda 2
        System.out.println("");

        ConstrSuprainc constr3 = new ConstrSuprainc(102, 9.5);
        constr3.display();                               //  este pentru Metoda 3
        System.out.println("");

        ConstrSuprainc constr4 = new ConstrSuprainc( 9.5 , 103);
        constr4.display();                               //  este pentru Metoda 3
        System.out.println("");

    }
}
