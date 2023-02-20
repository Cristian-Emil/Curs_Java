package elemente_de_teorie_2;

public class MetodaSuprainc {

    int x, y, z;
    double d1;

//  Avem metoda OVERLOADING a valorilor pentru diverse METHOD ---------------------------------------------------------

//  Metoda 1
    void suma()
    {
        x=101;
        y=102;
        System.out.println("Metoda 1 => " +(x+y)+ "\n");
    }

//  Metoda 2
    void suma(int a, int b)
    {
        x = a;
        y = b;
        System.out.println("Metoda 2 => " +(x+y)+ "\n");
    }

//  Metoda 3
    void suma(int a, double b)
    {
        x = a;
        d1 = b;
        System.out.println("Metoda 3 => " +(x+d1)+ "\n");
    }

//  Metoda 4
    void suma(double b, int a)
    {
        x = a;
        d1 = b;
        System.out.println("Metoda 4 => " +(x+d1)+ "\n");
    }


    public static void main(String[] args) {
        MetodaSuprainc metoda = new MetodaSuprainc();
        metoda.suma();                                      //  este pentru Metoda 1
        metoda.suma(101,102);                         //  este pentru Metoda 2
        metoda.suma(102,9.5);                         //  este pentru Metoda 3
        metoda.suma(9.5, 101);                        //  este pentru Metoda 4

    }
}
