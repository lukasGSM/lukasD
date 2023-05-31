package zadania;

import java.util.Scanner;

public class Zad20 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int WZORCOWA = 48;
        final double CIASTKANASZKLANKECUKRU = 48 / 1.5;
        final double CIASTKANASZKLANKEMASLA = 48 / 1;
        final double CIASTKANASZKLANKEMAKI = 48 / 2.75;
        System.out.println("Ile ciastek chcesz upiec?");
        int iloscCiastek = keyboard.nextInt();
        double potrzebnyCukier = iloscCiastek / CIASTKANASZKLANKECUKRU;
        double potrzebneMaslo = iloscCiastek / CIASTKANASZKLANKEMASLA;
        double potrzebnaMaka = iloscCiastek / CIASTKANASZKLANKEMAKI;
        System.out.println("Potrzebna ilość szklanek cukru: " + potrzebnyCukier);
        System.out.println("Potrzebna ilość szklanek masła: " + potrzebneMaslo);
        System.out.println("Potrzebna ilość szklanek mąki: " + potrzebnaMaka);
    }
}
