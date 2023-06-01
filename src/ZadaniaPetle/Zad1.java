package ZadaniaPetle;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int dolna = 0, gorna = 0;
        System.out.println("Podaj dolny kraniec przedziału - dodatnią liczbę całkowitą");
        dolna = keyboard.nextInt();
        System.out.println("Podaj górny kraniec przedziału - dodatnia liczbę całkowitą");
        gorna = keyboard.nextInt();
        while ((dolna < 1 || gorna < 1) || gorna < dolna) {
            if (gorna < dolna) {
                System.out.println("Górna granica powinna być większa niż dolna");
            } else {
                System.out.println("Liczby powinny być dodatnie");
            }
            System.out.println("Podaj dolny kraniec przedziału - dodatnią liczbę całkowitą");
            dolna = keyboard.nextInt();
            System.out.println("Podaj górny kraniec przedziału - dodatnia liczbę całkowitą");
            gorna = keyboard.nextInt();
        }
        int suma = 0;
        for (int i = dolna; i <= gorna; i++) {
            suma += i;
        }
        System.out.println("Suma liczb z tego przedziału to: " + suma);
    }
}
