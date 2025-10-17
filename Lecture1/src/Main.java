import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // deklaracja zmiennych typu int, dla liczb na których chcemy sprawdzić działanie operacji bitowych
        int a, b;

        // utworzenie obiektu Scanner dla wprowadzenia danych wejściowych (liczb typu int)
        Scanner input = new Scanner(System.in);

        // inicjalizacja zmiennych a i b danymi wejściowymi
        System.out.println("podaj a: ");
        a = input.nextInt();
        System.out.println("podaj b: ");
        b = input.nextInt();

        
        // deklarujemy dodatkowe zmienne oraz licznik iteracji przed pętlą while
        int c, d;
        int i = 1;

        while (true) {
            // wyświetla liczbę iteracji pętli while
            System.out.println("Iteracja: " + i);

            // wyświetlamy wejściowe wartości zmiennych a i b
            System.out.printf("a₁₀: %d | ", a);
            System.out.printf("a₂: %s\n", Integer.toBinaryString(a));
            System.out.printf("b₁₀: %d | ", b);
            System.out.printf("b₂: %s\n", Integer.toBinaryString(b));
            
            // operacja bitowa XOR (alternatywa rozłączna)
            /*
            obliczana jest suma bitów, bez przeniesienia na następną pozycję w lewo,
            gdy odpowiadające bity obu liczb w systemie binarnym są różne (tj. 0 i 1)
            */
            System.out.println("Operacja bitowa XOR ^ (alternatywa rozłączna)");
            c = a ^ b;
            System.out.printf("c₁₀: %d | ", c);
            System.out.printf("c₂: %s\n", Integer.toBinaryString(c));
            
            // operacja bitowa AND (koniunkcja)
            /*
            wyszukiwana jest pozycja bitów obu liczb w systemie binarnym,
            gdzie występuje przeniesienie, czyli oba bity mają wartość 1
            */
            System.out.println("Operacja bitowa AND & (koniunkcja)");
            d = a & b;
            System.out.printf("d₁₀: %d | ", d);
            System.out.printf("d₂: %s\n", Integer.toBinaryString(d));
            
            // operacja przeniesienia bitów o jedną pozycję w lewo <<
            System.out.println("Operacja przesunięcia bitowego w lewo << o 1 pozycję");
            d = d << 1;
            System.out.printf("d₁₀: %d | ", d);
            System.out.printf("d₂: %s\n", Integer.toBinaryString(d));
            
            // warunek który musi zostać spełniony żeby wyjść z pętli i wyświetlić wynik końcowy
            if (d == 0) {
                break;
            }
            
            // przypisanie zmiennej a wartości zmiennej c i zmiennej b wartości zmiennej d
            a = c;
            b = d;
            
            // inkrementacja licznika iteracji
            i++;
        }
        
        // końcowy wynik, który oczekujemy że powinien być 0 (inaczej program nie mógłby wyjść z pętli)
        System.out.println("Wynik");
        System.out.printf("c₁₀: %d | ", c);
        System.out.printf("c₂: %s\n", Integer.toBinaryString(c));
        
        // terminacja obiektu skanera
        input.close();
    }
}