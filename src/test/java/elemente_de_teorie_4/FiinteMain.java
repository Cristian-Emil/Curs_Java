package elemente_de_teorie_4;

public class FiinteMain {

    public static void main(String[] args) {

        Animal salbatic = new Animal();
        System.out.println();
        salbatic.afiseazaculoare();

/*  La apaleare o sa fiseze varianta DUVERSE CULORI pentru ca este ultima definita
    Pentru apelarea valorii initiale este necesara sa scriem in a doau definire:
    SUPER.culoare
    System.out.println(super.culoare); - apelaza culoare definita in clasa parinte si afiseaza GALBUI

    altfel sistemul ia valoare defaul , adica cea dfinita ultima data si o tateaza ca si pe
    THIS.diverse culoari - scris simplu "diverse culaori" in linia 13 si tiparita prin linia 15
    System.out.println(this.culoare) sau System.out.println(culoare) - apeleaza valoare definita in clasa curenta
    si afiseaza DIVERSE CULORI

 */

        System.out.println("");
        salbatic.mananca();
/*
    La fel ca mai sus ia ultima valoare definita adica afiseaza : Animalul carnivor mananca carne
    Pentru a accesa valaorea initiala definita in clasa parinte se scrie linia:
    super.mananca();
    si acerasta ne apeleaza linia initiala sin superclasa.
    In acest mopement pentru ca avem apelate ambele variante o sa apara ambele linii de cod
 */

//  ATENTIE: "super.cuvant" apeleaza imediat varaibila din clasa parinte    - exemplul 1 - culoare
//  ATENTIE: "super.cuvant" apeleaza imediat metoda din clasa parinte       - exemplul 2 - mancare

    }

}
