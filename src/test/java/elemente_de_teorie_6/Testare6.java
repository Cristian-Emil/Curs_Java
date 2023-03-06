package elemente_de_teorie_6;

public class Testare6 {

//  facem elmeentele private - ele se pot accesa doar din aceasta clasa
    private int x= 101;

    private void met1(){
        System.out.println("Aceasta este metoda 'met1'");
    }


    protected int y= 102;

    protected void met2(){
        System.out.println("Aceasta este metoda 'met2'");
    }



    int z= 103;

    void met3(){
        System.out.println("Aceasta este metoda 'met 3'");
    }

}
