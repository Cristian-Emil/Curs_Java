package elemente_de_teorie_6;

public class WrapperClasses {

    public static void main(String[] args) {
        int a= 101;                     //  Aici a este o primitiva.
        System.out.println(a);

        Integer x= 201;                 // Aici x este un obiect. El este definit ca si clasa INTEGER
        System.out.println(x);

//  Daca scriem "x" si punem punct o sa vedem o multitudine de variante, deci avem o clasa si un obiect - vezi randurile urmatoare
        x.intValue();
        x.byteValue();
        x.floatValue();

        System.out.println("");

//  Convertim PRIMITELE in OBIECTE si OBIECTELE in PRIMITIVE ( Autoboxing si Unboxing )

//  Aici avem sub forma de primitive si trebuie sa le transformam in OBJECT = AUTOBOXING
        byte b= 11;
        short s= 21;
        int i = 31;
        long l = 41;
        float f = 51f;
        double d = 61d;
        char c = 'G';
        boolean bo = true;

//  Convertim primitivele in obiecte
        Byte byte_obj = b;
        Short short_obj = s;
        Integer int_obj = i;
        Long long_obj = l;
        Float float_obj = f;
        Double double_obj = d;
        Character char_obj = c;
        Boolean boolean_obj = bo;

        System.out.println("Si avem obiectele: " );
//  tiparim valorile ca sa vedem ca sunt OBJECT acum
        System.out.println("Byte object = " + byte_obj);
        System.out.println("Short object = " + short_obj);
        System.out.println("Integer object = " + int_obj);
        System.out.println("Long object = " + long_obj);
        System.out.println("Float object = " + float_obj);
        System.out.println("Double object = " + double_obj);
        System.out.println("Character object = " + char_obj);
        System.out.println("Boolean object = " + boolean_obj);

        System.out.println("");
//  Ca sa transformam OBJECT in primitive facem  = UNBOXING
        byte bytevalue = byte_obj;
        short shortvalue = short_obj;
        int intvalue = int_obj;
        long longvalue = long_obj;
        float floatvalue = float_obj;
        double doublevalue = double_obj;
        char charvalue = char_obj;
        boolean booleanvalue= boolean_obj;

        System.out.println("Si avem primitivele: " );
//  tiparim valorile ca sa vedem ca sunt OBJECT acum
        System.out.println("byte value = " + bytevalue);
        System.out.println("short value = " + shortvalue);
        System.out.println("integer value = " + intvalue);
        System.out.println("long value = " + longvalue);
        System.out.println("float value = " + floatvalue);
        System.out.println("double value = " + doublevalue);
        System.out.println("character value = " + charvalue);
        System.out.println("boolean value = " + booleanvalue);


    }


}
