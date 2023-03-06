package elemente_de_teorie_4;

    class A{
        int a = 10;
        void M() {
            System.out.println(a);
        }
    }

    class B extends A {
        int b = 15;
        void N() {
            System.out.println(b);
        }
    }
public class Class_A_B {

    public static void main(String[] args) {
        B b_obiect = new B();

        System.out.println(b_obiect.a);
        System.out.println("");
        System.out.println(b_obiect.b);
        System.out.println("");

        b_obiect.M();
        System.out.println("");
        b_obiect.N();
        System.out.println("");

    }

}
