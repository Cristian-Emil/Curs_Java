package elemente_de_teorie_6;

public class Package_Modifier_Wrapper {

//  Access Modifier
/*
Avem gradele de acces:
public      - everywhere, se pot accesa de oriunde
protected   - only in package, but if use INHERITANCE can be access out of package ( EXTENDS )
default     - only in package where was defined
private     - only in class where was defined

 */


//  Wrapper Classes - Autoboxing si Unboxing
/*
byte        =>  Byte class
short       =>  Short class
int         =>  Integer class
long        =>  Long
float       =>  Flopat class
double      =>  Double class
char        =>  Character class
boolean     =>  Boolean class

String  length()sunstring() trim() ..... etc

String s = "Bun venit"

The WRAPPER CLASS in Java ne ofera mecansimul sa transformam primitivele in obiect si obiectele in primitive

 */


//   Data CONVERSION methods
/*
Avem formatul STRING ( SIR )
String s1 = "11"
String s2 = "21"
String s3 = "true"

String  ------> int         Integer.parseInt();
String  ------> double      Double.parseDouble();
String  ------> boolean     Boolean.parseBoolean();


Exemplu - numarul de telefon mobil:
int phoneNo = 0721000000;

int     ------> String      StringvalueOf(data);
double  ------> String      StringvalueOf(data);
boolean ------> String      StringvalueOf(data);
char    ------> String      StringvalueOf(data);

String  -------> char  // este imposibil de transformat ( not possible )

 */



}
