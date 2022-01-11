import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćw.5 */
        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */

        int Wiek= 30;
        int modulo = 28;
        int wynik = 22%3;
        if (wynik == 0){
            System.out.println("Twój wiek podzielny przez 3 ");
        } else {
            System.out.println("Twój wiek jest niepodzielny przez 3");
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        int nrIndeksu = 33784;
        String indeks = nrIndeksu%2 == 0 ? "Indeks parzysty": "Indeks nieparzysty" ;
        System.out.println(indeks);


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbę zmiennoprzecinkową:");
        float liczba = scan.nextFloat();
        if (liczba%1 == 0){
            System.out.println("Liczba jest Całkowita");
        } else if (liczba%1 != 0){
            System.out.println("Liczba nie jest całkowita");
        }
   /*     else {
            System.out.println("Liczba jest większa od 10");
        }
*/



    }
}
