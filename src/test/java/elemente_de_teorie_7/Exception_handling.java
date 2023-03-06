package elemente_de_teorie_7;

public class Exception_handling {

//  ERORILE
/*
Erorile pot sa fie de urmatoarele tipuri:
1)  de sintaxa      -----> Syntax
2)  de logica       ------> Logical


Erorile de sintaxa apar atunci cand sunt introduse datele manual in mod incorect sau sunt omise.
In general ele sunt numete exceptii . In general programul ne arata unde am gresit in cazul acestor tipuri de eroare

Exceptiile apar atunci cand utilizatorul furnizeaza date invalide catre program.
Exceptia este un eveniment care o sa duca la oprirea sau inchiderea programului de testare.


Exceptii verificate ( Checked exceptions )
    Sunt exceptiile care sunt identificate de compilatorul Java-Selenium
Model de "Checked exception":
1). ElementNotVisibleException
Aceasta exceptie este aruncata atunci cand Selenium nu poate gasi un element din cauza faptului că acesta nu este vizibil.
2). ElementNotSelectableException
Aceasta exceptie este aruncata atunci cand încercati sa selectati un element care nu poate fi selectat.
3). NoSuchElementException
Aceasta exceptie este aruncata atunci cand Selenium nu poate gasi un element în pagina web.
4). NoSuchWindowException
Aceasta exceptie este aruncata atunci cand Selenium incearca sa opereze asupra unei ferestre care nu exista.
5). StaleElementReferenceException
Aceasta exceptie este aruncata atunci cand un element pe care Selenium incerca sa-l acceseze dar a fost modificat sau nu
mai exista pe pagina.
Exemple :
Interrupted exceptions
File not found
IOException

Aceste excepții verificate pot fi gestionate în cod prin utilizarea blocurilor try-catch sau prin utilizarea declaratiei
throws pentru a transmite exceptiile mai departe. Este important sa gestionati aceste exceptii în codul dvs. Selenium
pentru a va asigura ca testele dvs. sunt mai robuste si mai fiabile.


Exceptii neverificate ( Un-checked exceptions )
        Sunt exceptiile care nu sunt identificate de compilatorul Java-Selenium
Model de "Un-checked exceptie":
1). NoSuchElementException
Aceasta exceptie este aruncata atunci cand Selenium nu poate gasi un element pe pagină.
2). TimeoutException
Aceasta exceptie este aruncata atunci cand Selenium nu poate finaliza o actiune intr-un anumit interval de timp.
3). WebDriverException
Aceasta exceptie este o exceptie generala pentru orice problema care poate aparea în WebDriver.
4). SessionNotCreatedException
Aceasta exceptie este aruncată atunci când nu se poate crea o sesiune WebDriver.
5). InvalidArgumentException
Aceasta exceptie este aruncata atunci cand argumentele sunt incorecte sau nu sunt valabile.
Exemple :
ArithmeticalException
NullPointException
ArrayIndexOutBoundsException

Aceste exceptii ne-verificate nu necesita sa fie gestionate explicit în codul dvs. si pot fi lasate să fie aruncate si
tratate automat. Cu toate acestea, este important sa luati masuri pentru a preveni aceste erori, prin verificarea atenta
a paginilor web, a actiunilor si a interactiunilor cu elementele din pagina web.



Erorile de logica sunt de mai multe feluri, in functie de modul in care e scris codul.
Iată cateva exemple dintre cele mai comune erori de logica.
1.) Selectarea elementului greșit:
O eroare frecventa este selectarea unui element gresit pe pagina, ceea ce poate duce la eșecul actiunilor sau la
obtinerea de rezultate neașteptate. Este important sa utilizati selectori precisi si sa verificati de mai multe
ori daca elementul selectat este cel corect.
2). Asteptarea insuficienta sau prea multa:
Așteptarea este o parte importantA a codului Selenium, iar așteptarea prea puțin sau prea mult poate duce la esecul
testelor. Este important sa setati timpul de asteptare adecvat pentru fiecare actiune si sa verificati daca actiunile
au fost finalizate inainte de a continua.
3). Ordinea actiunilor:
Ordinea actiunilor este importanta în Selenium. Încercați să urmați fluxul natural al paginii web pentru a evita erorile.
In plus, asigurați-va ca toate actiunile sunt efectuate in ordinea corecta.
4). Manipularea incorecta a elementelor:
Manipularea incorecta a elementelor poate duce la erori de logica în Selenium. Asigurați-va ca folositi metodele corecte
pentru a obtine si manipula elementele si verificati daca elementele sunt prezente pe pagina înainte de a incerca sa le
manipulați.
5). Testarea insuficienta:
O alta eroare de logica comuna este testarea insuficienta. Este important sa testati toate functionalitatile paginii web
pentru a va asigura ca nu exista erori sau probleme în cod. Incercati sa testati diferite scenarii si conditii pentru a
verifica daca toate actiunile functioneaza corect.

Pentru a evita aceste erori, este important sa scrieți codul cu atentie si sa verificati fiecare etapa a testelor Selenium.
De asemenea, puteti utiliza instrumente precum debugger-ul pentru a identifica si rezolva rapid erorile de logica.

 */


// To catching exception we will use try ... catch block - PRINDEREA EXCEPTIILOR
/*  Exemplu in HandleExceptions

La rularea programului , linia 46 ne da mesajul:

java.lang.ArithmeticException: / by zero
	at elemente_de_teorie_7.HandleExceptions.main(HandleExceptions.java:46)

Si ne anunta ca avem o exceptie in acel punct.
In cazul in care nu dorim sa primim mesajul facem linia TEXT sau o stergem

Deci folosind comanda try-catch avem exceptiile care sunt identificate de compilatorul Java
ATENTIE: Un block TRY poate sa contina mai multe linii de CATCH pentru a gestiona diferite exceptii.
Exemplu:
try
{
    // Some code that may throw an exception
}
catch (DivideByZeroException ex)
{
    // Handle divide by zero exception
}
catch (InvalidOperationException ex)
{
    // Handle invalid operation exception
}
catch (Exception ex)
{
    // Handle any other exceptions
}

Deci putem gestiona multiple CATCH cu un singur TRY.
Regula de functionare este ca fiecare bloc catch poate specifica un tip de exceptie diferit pe care il poate gestiona.
Cand o exceptie este aruncata in blocul try, timpul de executie va verifica fiecare bloc catch in ordine, incepand cu
primul bloc catch, pentru a vedea daca poate gestiona exceptia. Daca un bloc catch poate gestiona exceptia, codul sau va
fi executat, iar programul va continua ss se execute dupa blocul catch. Daca niciunul dintre blocurile catch nu poate
gestiona exceptia, atunci exceptia se va propaga in stiva de apeluri pana cand este gestionata de un handler de exceptie
de nivel superior sau pana programul se va termina.

Exemplu :  vezi MultipleHandleExcep
 */


// EXCEPTION e      - exemplu general de exceptii
/*
Aceasta linie ne arunca toate exceptiile intalnite pe parcurs
Vezi:  AllGeneralExceptions
 */


//  CHECKED EXCEPTION
/* Daca scriem in PSVM exceptia :
    public static void main(String[] args) throws InterruptedException { .... }
atunci ea nu mai trebuie specificata pe parcursul programului.

Altfel ea se aplica ca in exemplul din class:
     CheckedExceptions.java
unde avem in linia de catch conditia impusa (linia 13).
Acesta ne realizeaza exceptia de a avea un numar de milisecunde ( aici 5000 = 5 secunde ) timp de
asteptare care este impus din blocul de comanda/executie.

Diferenta dintre cele 2 este ca :
- interrupt exception scrisa in PSVM e valabila pana la incheierea programului
- interrupt exception scrisa in catch este valabila doar pentru blocul respectiv. Daca avem un alt bloc
catch anterior, exceptia n-o sa fie valabila si pentru acesta.

 */

}
