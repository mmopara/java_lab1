import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 Proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        boolean a = true;
        boolean b = true;
        boolean c = false;

        System.out.println("(a!=b)" + (a != b));
        System.out.println("(a&&b)" + (a && b));
        System.out.println("(b||c)" + (b || c));


        int x = 3;
        int y = 7;
        int z = 14;
        System.out.println("(x>z)" + (x > z));
        System.out.println("((a&&b)||(x>x))" + ((a && b) || (x > x)));
    }
}