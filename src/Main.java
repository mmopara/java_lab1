import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // int zmiennaInt = 7;
        // System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
         *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */

        int promienKola = 8;
        double pi = 3.14;
        float pi2 = 3.14f;
        char znak = 'A';
        boolean wartoscLogiczna = true;
        byte  bicik = 1;
        String Zdanko = "To jest przykładowe zdanie do przedstawienia zmiennej typu string";
        short szort = 1234 ;
        long dlugie = 123456789 ;

        System.out.println("Zmienna int: " + promienKola);
        System.out.println("Zmienna double: " + pi);
        System.out.println("Zmienna float: " +pi2);
        System.out.println("Zmienna char: " + znak);
        System.out.println("Zmienna bool: " + wartoscLogiczna);
        System.out.println("Zmienna byte: " + bicik  );
        System.out.println("Zmienna string: " +Zdanko);
        System.out.println("Zmienna short: " +szort);
        System.out.println("Zmienna long: " + dlugie);

        int liczbaA = 10;
        int liczbaB = 5;
        System.out.println(liczbaA + " + " + liczbaB + " = " + liczbaA + liczbaB);
        System.out.println(liczbaA + " - " + liczbaB + " = " + (liczbaA - liczbaB));
        System.out.println(liczbaA + " * " + liczbaB + " = " +  liczbaA * liczbaB);
        System.out.println(liczbaA + " / " + liczbaB + " = " + liczbaA / liczbaB);
        System.out.println("Reszta z dzielenia " + liczbaA + " i " + liczbaB + " =  " + liczbaA % liczbaB);



        double liczbaX = 5.2;
        double liczbaY = 2.5;

        System.out.println(liczbaX + " + " + liczbaY + " = " + (liczbaX + liczbaY));
        System.out.println(liczbaX + " - " + liczbaY + " = " + (liczbaX - liczbaY));
        System.out.println(liczbaX + " * " + liczbaY + " = " +  liczbaX * liczbaY);
        System.out.println(liczbaX + " / " + liczbaY + " = " + liczbaX / liczbaY);
        System.out.println("Reszta z dzielenia " + liczbaX + " i " + liczbaY + " =  " + liczbaX % liczbaY);

    }
}