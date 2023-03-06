package elemente_de_teorie_4;

public class Fiinte {

    String culoare ="Galbui";

    void mananca(){
        System.out.println("Mananca divesre alimente .... ");
    }
}

class Animal extends Fiinte {
    String culoare = "diverse culori";
    void afiseazaculoare(){
        System.out.println(super.culoare);
    }

    void mananca(){
        System.out.println("Animalul carnivor mananca carne");
        super.mananca();
    }
}