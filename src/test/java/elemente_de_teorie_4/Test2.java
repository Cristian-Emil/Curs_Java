package elemente_de_teorie_4;

public class Test2 {

        String numele = "Acesta e numele meu";
        final String Specie = "Sunt Homo-Sapiens";

        void Personaj() {
            System.out.println(numele);
            }

        public static void main(String[] args) {
            Test2 pers = new Test2();                   //  Am creat un OBJECT prin care apelam variabilele

            System.out.println("\n" + "Aici incepe testul pt obiecte");
                System.out.println("");
            pers.Personaj();
                System.out.println("");
            System.out.println(pers.Specie);
        }
}
