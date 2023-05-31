package zadania;

import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final double MARZA = 0.4;
        System.out.println("Podaj cenę detaliczną: ");
        double cenaDetaliczna = keyboard.nextDouble();
        double zyskZeSprzedazy = cenaDetaliczna * MARZA;
        System.out.println("Zysk ze sprzedaży płytki: " + zyskZeSprzedazy);
    }
}
