package zadania;

import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] oceny = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj ocenę z " + (i + 1) + " testu: ");
            oceny[i] = keyboard.nextInt();
        }
        double average = (double) (oceny[0] + oceny[1] + oceny[2]) / 3;
        for (int i = 0; i < 3; i++) {
            System.out.println("Wynik z " + (i + 1) + " testu: " + oceny[i]);
        }
        System.out.println("Średnia ocen: " + average);
    }
}
