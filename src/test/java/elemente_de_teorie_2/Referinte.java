package elemente_de_teorie_2;

public class Referinte {

    int x, y;                           // variabile instantiate / generate

    void setareDate1(int a, int b) {      // variabile locale
        x = a;
        y = b;
    }

    void setareDate2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void dislpay(){
        System.out.println(x);
        System.out.println(y);
            }

        public static void main(String[] args) {

        Referinte metoda1 = new Referinte();
        metoda1.setareDate1(10,20);
        metoda1.dislpay();

        System.out.println("");

        Referinte metoda2 = new Referinte();
        metoda2.setareDate2(101, 102);
        metoda2.dislpay();

    }
}
