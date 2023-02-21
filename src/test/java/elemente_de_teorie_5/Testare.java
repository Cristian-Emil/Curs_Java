package elemente_de_teorie_5;

    class Teste{
    final int x = 101;
    double y = 201;
}

public class Testare {

        public static void main(String[] args) {
        Teste test= new Teste();
//        test.x=301;       // este incorecta pt ca linia 4 eset FINAL deci nu se poate modifica
            System.out.println(test.x);

/*  Pentru a ccesa valoare din class Testa se defineste variabila x ca FINAL si atunci avem eroare in linia test.x care
  trebuie comentata


 */
    }
}

