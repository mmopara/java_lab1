import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */


        double [] tab = new double[10];

        tab[1] = 1;
        tab[2] = 2;
        tab[3] = 3;
        tab[4] = 4;
        tab[5] = 5;

        System.out.println("Pierwsza pozycja w tabeli to: " + tab[1]);
        System.out.println("Druga pozycja w tabeli to: " + tab[2]);
        System.out.println("Trzecia pozycja w tabeli to: " + tab[3]);
        System.out.println("Czwarta pozycja w tabeli to: " + tab[4]);
        System.out.println("Piąta pozycja w tabeli to: " + tab[5]);
    }
}
