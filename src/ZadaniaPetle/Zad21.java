package ZadaniaPetle;

import java.util.Random;
import java.util.Scanner;

public class Zad21 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int start = 0;
        while (start != 1) {
            System.out.println("GRA W KOŚCI\n" +
                    "ZASADY GRY: \n" +
                    "1. Do dyspozycji masz 6 standardowych kości do gry\n" +
                    "2. Gra trwa 5 tur\n" +
                    "3. Pierwszy rzut wykonujesz wszystkimi 6 kośćmi." +
                    " Następnie masz do dyspozycji dwa opcjonalne rzuty, w których możesz wybrać jedną z kości i rzucić ją jeszcze raz\n" +
                    "Komputer ma 50% szans na zdecydowanie się na ponowny rzut\n" +
                    "4. Wyniki z 6 kości są sumowane. Wyrzucenie tej samej wartości na kilku kościach daje bonus - powoduje pomnozenie wyniku o ilość powtórzeń\n" +
                    "5. Gracz, który zdobędzie większą łączną ilość punktów wygrywa\n" +
                    "Naciśnij 1 aby rozpocząć grę"
            );
            start = keyboard.nextInt();
        }
        int[] gracz = new int[6];
        int[] komputer = new int[6];
        int punktyGracza = 0;
        int punktyKomputera = 0;
        int wygraneRundyGracz = 0;
        int wygraneRundyKomputer = 0;
        Random losowanie = new Random();
        for(int i = 1; i <= 5; i++) {
            for (int j = 0; j < 6; j++) {
                gracz[j] = (losowanie.nextInt(6) + 1);
                komputer[j] = (losowanie.nextInt(6) + 1);
            }
            System.out.println("Wynik twojego rzutu: ");
            for (int j = 0; j < 6; j++) {
                System.out.println("Kość nr" + (j + 1) + ": " + gracz[j]);
            }
            keyboard.nextLine();
            System.out.println("Czy chcesz rzucić drugi raz którąś z kości? (Jeśli tak wpisz TAK)");
            String decyzja1 = keyboard.nextLine();
            if (decyzja1.equalsIgnoreCase("TAK")) {
                System.out.println("Którą kością chciałbyś rzucić jeszcze raz? (1-6)");
                int numerKosci = keyboard.nextInt();
                gracz[numerKosci - 1] = (losowanie.nextInt(6) + 1);
                System.out.println("Wynik twojego rzutu: ");
                for (int j = 0; j < 6; j++) {
                    System.out.println("Kość nr" + (j + 1) + ": " + gracz[j]);
                }
                keyboard.nextLine();
                System.out.println("Czy chcesz rzucić trzeci raz którąś z kości? (Jeśli tak wpisz TAK)");
                String decyzja2 = keyboard.nextLine();
                if (decyzja2.equalsIgnoreCase("TAK")) {
                    System.out.println("Którą kością chciałbyś rzucić jeszcze raz? (1-6)");
                    numerKosci = keyboard.nextInt();
                    gracz[numerKosci - 1] = (losowanie.nextInt(6) + 1);
                    System.out.println("Wynik twojego rzutu: ");
                    for (int j = 0; j < 6; j++) {
                        System.out.println("Kość nr" + (j + 1) + ": " + gracz[j]);
                    }
                }
            }
            int mnoznikGracz = 1;
            for (int k = 1; k <= 6; k++) {
                int licznikWystapien = 0;
                for (int l = 0; l < 6; l++) {
                    if (gracz[l] == k) {
                        licznikWystapien++;
                    }
                }
                if (licznikWystapien > 1) {
                    mnoznikGracz *= licznikWystapien;
                }
            }
            int sumaGraczTura = 0;
            for (int j = 0; j < 6; j++) {
                sumaGraczTura += gracz[j];
            }
            int punktyTura = sumaGraczTura * mnoznikGracz;
            System.out.println("Punkty zdobyte przez ciebie w tej turze: " + punktyTura);
            punktyGracza += punktyTura;

            System.out.println("Wynik rzutu komputera: ");
            for (int j = 0; j < 6; j++) {
                System.out.println("Kość nr" + (j + 1) + ": " + komputer[j]);
            }
            int decyzjaKomputera = losowanie.nextInt(2);
            if (decyzjaKomputera == 1) {
                int numerKosci = losowanie.nextInt(6);
                komputer[numerKosci] = (losowanie.nextInt(6) + 1);
                System.out.println("Komputer zdecydował się rzucić 2 raz. Oto wynik: ");
                for (int j = 0; j < 6; j++) {
                    System.out.println("Kość nr" + (j + 1) + ": " + komputer[j]);
                }
                int decyzjaKomputera2 = losowanie.nextInt(2);
                if (decyzjaKomputera2 == 1) {
                    numerKosci = losowanie.nextInt(6);
                    komputer[numerKosci] = (losowanie.nextInt(6) + 1);
                    System.out.println("Komputer zdecydował się rzucić 3 raz. Oto wynik: ");
                    for (int j = 0; j < 6; j++) {
                        System.out.println("Kość nr" + (j + 1) + ": " + komputer[j]);
                    }
                }
            }
            int mnoznikKomputer = 1;
            for (int k = 1; k <= 6; k++) {
                int licznikWystapien = 0;
                for (int l = 0; l < 6; l++) {
                    if (komputer[l] == k) {
                        licznikWystapien++;
                    }
                }
                if (licznikWystapien > 1) {
                    mnoznikKomputer *= licznikWystapien;
                }
            }
            int sumaKomputerTura = 0;
            for (int j = 0; j < 6; j++) {
                sumaKomputerTura += komputer[j];
            }
            int punktyKomputerTura = sumaKomputerTura * mnoznikKomputer;
            System.out.println("Punkty zdobyte przez komputer w tej turze: " + punktyKomputerTura);
            punktyKomputera += punktyKomputerTura;
            if (punktyTura > punktyKomputerTura) {
                wygraneRundyGracz++;
            } else if (punktyTura == punktyKomputerTura) {
                wygraneRundyGracz++;
                wygraneRundyKomputer++;
            } else {
                wygraneRundyKomputer++;
            }
        }
        if (punktyGracza > punktyKomputera) {
            System.out.println("Gratulacje wygrałeś");
        } else if (punktyGracza == punktyKomputera) {
            System.out.println("To niesamowite. Macie tą samą ilość punktów. Remis");
        } else {
            System.out.println("Niestety nie udało ci się");
        }
        System.out.println("Twoje punkty: " + punktyGracza);
        System.out.println("Punkty komputera: " + punktyKomputera);
        System.out.println("Wygrane przez ciebie tury: " + wygraneRundyGracz);
        System.out.println("Tury wygrane przez komputer: " + wygraneRundyKomputer);
    }
}
