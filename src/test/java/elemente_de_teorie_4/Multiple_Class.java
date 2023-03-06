package elemente_de_teorie_4;

class Clasa1{
    void V1( int a){
        System.out.println(a);
    }

}

class Clasa2{
    void V2( int b){
        System.out.println(b);
    }
}

//class MAXIM extends Clasa1 , Clasa2{
//    void V3( int c){
//        System.out.println(c);
//    }
//}

/*
Am comantat class MAXIM pentru ca avem eroare - vezi comenatriul din Class_Inheritance despre MULTIPLE
 */

public class Multiple_Class {

    public static void main(String[] args) {

        Clasa1 clasa_obj1 = new Clasa1();

        Clasa2 clasa_obj2 = new Clasa2();

        clasa_obj1.getClass();
        clasa_obj2.getClass();
    }
}
