package elemente_de_teorie_6;

public class DataConversion {

    public static void main(String[] args) {

//  Convertim din       String  ------> int

    String s ="BUN VENIT";
    String s1 = "101";
    String s2 = "201";

        System.out.println(s1 + " si " + s2);
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));  // am convertiti pe s1 si s2 in format NUMAR

        System.out.println("");

//  Convertim din       String  ------> double

    String s3 = "101.11";
    String s4 = "201.21";

        double s3db1 = Double.parseDouble(s3);
        double s4db1 = Double.parseDouble(s4);

        System.out.println(s3db1 + " si " + s4db1);
        System.out.println(s3db1 + s4db1);                                  // am convertiti pe s3 si s4 in format NUMAR CU VIRGULA
        System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));  // randurile 26 si 27 sunt echivalente

        System.out.println("");

//  Convertim din       String  ------> boolean

    String s5 = "true";

         boolean bool = Boolean.parseBoolean(s5);

        System.out.println(bool);
        System.out.println(Boolean.parseBoolean(s5));   // randurile 38 si 39 sunt echivalente

        System.out.println("");

//  Convertim din       int, double, char, boolean  ------> String

    int a= 10;
    double d = 21.21d;
    char c = 'A';
    boolean b = true;

        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(b));


    }
}
