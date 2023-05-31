package zadania;

import java.util.Scanner;

public class Zad17 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj cene posiłku:");
        double cenaPosilku = keyboard.nextDouble();
        double podatek = 0.0675 * cenaPosilku;
        double napiwek = (cenaPosilku + podatek) * 0.2;
        double lacznaKwota = cenaPosilku + podatek + napiwek;
        System.out.println("Cena posiłku: " + cenaPosilku);
        System.out.println("Wartość podatku: " + podatek);
        System.out.println("Wartość napiwku: " + napiwek);
        System.out.println("Łączna kwota do zapłaty: " + lacznaKwota);
    }
}
