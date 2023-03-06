package elemente_de_teorie_4;

    class Parinte {
        void afiseaza(int a) {
            System.out.println(a);
        }
    }

    class Copil1 extends Parinte {
        void arata1(int b) {
            System.out.println(b);
        }
    }
        class Copil2 extends Parinte {
            void arata2(int c) {
                System.out.println(c);
            }
    }

    public class Parinte_copii{

        public static void main(String[] args) {

            Copil1 copil1 = new Copil1();
            copil1.afiseaza(41);
            copil1.arata1(21);

            System.out.println("");

            Copil2 copil2 = new Copil2();
            copil2.afiseaza(41);
            copil2.arata2(11);

        }

}


