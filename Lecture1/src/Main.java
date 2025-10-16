import java.util.Scanner;


public class Main {
    void main() {
        // deklaracja zmiennych typu int
        int a, b;

        IO.println("podaj a: ");
        a = getInteger();
        IO.println("podaj b: ");
        b = getInteger();


        IO.println(a + b);
    }

    int getInteger() {
        // importowanie obiektu skanera
        Scanner input = new Scanner(System.in);
        // zapisanie wprowadzonej przez użytkownika liczby w zmiennej num
        int num = input.nextInt();
        // terminacja obiektu skanera
        input.close();
        // zwrócenie wartości wpowadzonej przez użytkownika liczby
        return num;
    }
}