package zadania;

import java.util.Scanner;

public class Zad23 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj długość rzędu w metrach: ");
        double dlugosc = keyboard.nextDouble();
        System.out.println("Podaj ilość miejsca zajmowanego przez okratowanie w metrach");
        double okratowanie = keyboard.nextDouble();
        System.out.println("Podaj odległości między sadzonkami w metrach: ");
        double odleglosci = keyboard.nextDouble();
        int liczbaSadzonek =  (int)((dlugosc - 2 * okratowanie) / odleglosci);
        System.out.println("Ilość sadzonek, które zmieszczą się w rzędzie: " + liczbaSadzonek);
    }
}
