package zadania;

import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double iloscKilometrow;
        int zuzyteLitry;
        System.out.println("Ile kilometrów przejechaleś? ");
        iloscKilometrow = keyboard.nextDouble();
        System.out.println("Ile litrów paliwa zużyłeś? ");
        zuzyteLitry = keyboard.nextInt();
        double kilometryNaLitr = iloscKilometrow / zuzyteLitry;
        System.out.println("Kilometry przejechana na litr paiwa: " + kilometryNaLitr);
    }
}
