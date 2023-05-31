package zadania;

import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj swoje ulubione miasto:");
        String ulubioneMiasto = keyboard.nextLine();
        int liczbaZnakow = ulubioneMiasto.length();
        String wielkimi = ulubioneMiasto.toUpperCase();
        String malymi = ulubioneMiasto.toLowerCase();
        char pierwszyZnak = ulubioneMiasto.charAt(0);
        System.out.println("Liczba znaków w nazwie: " + liczbaZnakow);
        System.out.println("Nazwa wielkimi literami: " + wielkimi);
        System.out.println("Nazwa malymi literami: " + malymi);
        System.out.println("Pierwszy znak: " + pierwszyZnak);
    }
}
