package zadania2;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj dzień liczbowo: ");
        int dzien = keyboard.nextInt();
        System.out.println("Podaj miesiąc liczbowo: ");
        int miesiac = keyboard.nextInt();
        System.out.println("Podaj dwie ostatnie cyfry roku: ");
        int rok = keyboard.nextInt();
        if (dzien * miesiac == rok) {
            System.out.println("Data jest magiczna");
        } else {
            System.out.println("Data nie jest magiczna");
        }
    }
}
