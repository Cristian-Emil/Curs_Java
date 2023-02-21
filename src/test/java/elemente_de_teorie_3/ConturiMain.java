package elemente_de_teorie_3;


public class ConturiMain {

    public static void main(String[] args) {

        Conturi cont_no1 = new Conturi();

        cont_no1.setCont(1357);
        cont_no1.setNume("Popescu");
        cont_no1.setValoare(15000);

        System.out.println(cont_no1.getCont());
        System.out.println(cont_no1.getNume());
        System.out.println(cont_no1.getValoare());
    }


}
