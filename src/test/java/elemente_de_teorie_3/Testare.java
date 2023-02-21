package elemente_de_teorie_3;

public class Testare{
        class teste
    {
    static String a = "Bun Venit";
    }

    public static void main(String[]args){
        teste.a.length();
        System.out.println(teste.a.length());
        }

//  Se observa ca nu avem nevoie de OBJECT ca sa apelam String din metoda statica ce a fost definita.

/*
ATENTIE: IN CADRUL LINIEI "PSVM - PUBLIC STATICA VOID MAIN ...: pozitia lui public si static nu conteaza
Acestea se pot schimba intre ele:

public static void main(String[]args)
static public void main(String[]args)

public  - este un modificator public
static  - este cuvantul ceheie care defineste daca e static sau non-static
void    - este un cuvant care indicat ca o metoda nu returneaza valoare
main    - este oo metoda speciala care serveste ca punct de intrare al unui program Java.
          Este metoda care se executa atunci cand un program Java incepe sa ruleze.

public static void main(String[]args) - este clasa principala si fara caeasta nu putem rula/executa clasa noastra
 */


}