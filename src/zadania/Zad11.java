package zadania;

import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wartość kupowanego produktu: ");
        double wartosc = keyboard.nextDouble();
        double podatekStanowy = 0.04 * wartosc;
        double podatekLokalny = 0.02 * wartosc;
        double cenaSprzedazy = wartosc + podatekStanowy + podatekLokalny;
        System.out.println("Wartość produktu: " + wartosc);
        System.out.println("Wartość podatku stanowego: " + podatekStanowy);
        System.out.println("Wartość podatku lokalnego: " + podatekLokalny);
        System.out.println("Cena sprzedazy: " + cenaSprzedazy);
    }
}
