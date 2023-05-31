package zadania;

import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int CIASTKAWPUDELKU = 40;
        final int PORCJEWPUDELKU = 10;
        final int CIASTKAWPORCJI = CIASTKAWPUDELKU / PORCJEWPUDELKU;
        final int KALORIEPORCJI = 300;
        final int KALORIECIASTKA = KALORIEPORCJI / CIASTKAWPORCJI;
        System.out.println("Ile ciastek zjadłeś?");
        int zjedzoneCiastka = keyboard.nextInt();
        System.out.println("Kalorie spożyte przez ciebie: " + zjedzoneCiastka * KALORIECIASTKA + " kcal");
    }
}
