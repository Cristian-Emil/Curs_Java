package elemente_de_baza;

public class Curs1_1_Primitive {

/* trebuie sa definim tipul de spatiu de lucru
deci introducem linia de mai jos si tot ce scriem
trebuie sa fie intre acoladele de inceput si sfarsit { }
 */

    public static void main(String[] args) {

//  Aceasta este o linie de text si nu se executa de catre program

/*  Acestea sunt mai multe linii de text
    si nu se executa de catre program
*/

//  ORICE SE FACE IN JAVA ESTE UN OBIECT

/*  PRIMITIVE
byte
short
int         - stocheaza numere intregi de la 2 milioane si ceva la 2 miliarde si ceva
long
float
double      - stocheaza numere fractionale
char        - stocheaza caractere, se pun intre ghilimele
boolean     - stocheaza 2 valori, TRUE sau FALSE

Exemple de dat primitive in liniile de mai jos
 */

//  Variabila "a" de tip INTEGER se defineste si se tipareste
        int a;
        a= 123456789;
        System.out.println(a);

// putem face definire intr-un singur pas si tiparim
        int b = 234567890;
        System.out.println(b);

//  Variabila "c" de tip FLOAT ( numar cu virgula cu maxim 7 zecimale) se defineste si se tipareste
        float c = 3.14151617f;
        System.out.println(c);

//  Variabila "d" de tip DOUBLE ( numar cu virgula cu maxim 13 zecimale ) se defineste si se tipareste
        double d = 3.14151617181920;
        System.out.println(d);

//  Caracterul "e" de tip CHAR se defineste si se tipareste
        char e = 'z';
        System.out.println(e);

//  Caracterul "f" de tip BOOLEAN ( TRUE or FALSE ) se defineste si se tipareste
        boolean litera = true;
        System.out.println(litera);


    }

}
