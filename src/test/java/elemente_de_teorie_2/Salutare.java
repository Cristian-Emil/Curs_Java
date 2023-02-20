package elemente_de_teorie_2;

public class Salutare {

//  Varianta 1 - nu avem paramtru' , nu returnam valaore.
    void salutare1(){
        System.out.println("Te salut calduros domnule");
    }

//  Variant 2 - nu avem parmatru' dar returnam valoare specificata in metoda

    String salutare2(){
        return "Salutare doamnelor si domnilor ";
    }

//  Variant 3 - avem parametru' dar nu returnam valoare, valoare acestuia se defineste cand editam NUME

    void salutare3(String nume1){
        System.out.println("Salut domnule " + nume1);
    }

//  Variant 4 - avem parmatru' SI returnam valoarea pe care e definita in metoda
        String salutare4(String nume2){
            return ( "Salutare domnule " + nume2);
        }


}
