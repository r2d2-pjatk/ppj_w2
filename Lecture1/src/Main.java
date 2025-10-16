import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // deklaracja zmiennych typu int
        int a, b;

        // utworzenie obiektu Scanner dla danych wejściowych
        Scanner input = new Scanner(System.in);

        // inicjalizacja zmiennych a i b danymi wejściowymi
        System.out.println("podaj a: ");
        a = input.nextInt();
        System.out.println("podaj b: ");
        b = input.nextInt();

        // deklarujemy potrzebne zmienne na zewnątrz pętli
        int c, d;

        while (true) {
            c = a ^ b;
            d = a & b;
            d = d << 1;

            if (d == 0) {
                break;
            }
            a = c;
            b = d;
        }

        // terminacja skanera
        input.close();
    }
}