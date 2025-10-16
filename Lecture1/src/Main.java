import java.util.Scanner;


public class Main {
    static void main(String[] args) {
        // deklaracja zmiennych typu int
        int a, b;

        // utworzenie obiektu Scanner dla danych wejściowych
        Scanner input = new Scanner(System.in);

        // inicjalizacja zmiennych a i b danymi wejściowymi
        System.out.println("podaj a: ");
        a = input.nextInt();
        System.out.println("podaj b: ");
        b = input.nextInt();

        IO.println(a + b);
        // terminacja skanera
        input.close();
    }
}