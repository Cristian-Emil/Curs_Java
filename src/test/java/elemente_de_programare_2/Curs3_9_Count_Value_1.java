package elemente_de_programare_2;

public class Curs3_9_Count_Value_1 {

    public static void main(String[] args) {
        int numar = 123456789;
        System.out.println("Suma numerelor este =" + getSum(numar));
    }

    static int getSum(int numar)
    {
        int suma=0;

        while(numar !=0 )
        {
            suma = suma + numar%10;
            numar = numar/10;
        }
        return suma;

    }

}
