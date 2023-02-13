package elemente_de_programare_1;

public class Curs2_4_Count_Digits2 {

    public static void main(String[] args) {

// Este varianta 2 a cazului anterior , gandita separat
        int numar = 98765;

//  Alegem o variabila pentru a stoca numarul de cifre din numar
        int count = 0;

//  Contorizam numarul de cifre din numar pana ajungem la zero
        while(numar!=0) {
            numar = numar/10;   //  se elimina ultimul numar/cifra
            count++;
        }

        System.out.println("Number of digits = " + count);
    }
//  CONTORIZAM NUMARUL DE ELEMENTE DIN SIRUL DAT - rezultatul este afisat pe ecran

}
