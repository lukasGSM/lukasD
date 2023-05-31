package zadania;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Zad21 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj kwotę początkowo zdeponowaną na koncie: ");
        double kwotaPoczatkowa = keyboard.nextDouble();
        System.out.println("Podaj roczną stopę oprocentowania: ");
        double stopaOprocentowania = keyboard.nextDouble();
        System.out.println("Ile razy w roku kapitalizowane są odsetki?: ");
        int czestoscKapitalizacji = keyboard.nextInt();
        System.out.println("Ile lat środki będą na koncie?");
        double liczbaLat = keyboard.nextDouble();
        double koncowaKwota = kwotaPoczatkowa * Math.pow(1 + stopaOprocentowania/czestoscKapitalizacji, czestoscKapitalizacji * liczbaLat);
        BigDecimal bd = new BigDecimal(koncowaKwota).setScale(2, RoundingMode.DOWN);
        System.out.println("Po tym czasie na koncie będzie: " + bd.doubleValue());
    }
}
