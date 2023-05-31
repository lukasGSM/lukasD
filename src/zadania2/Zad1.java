package zadania2;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj liczbę rzymską: ");
        String liczbaRzymska = keyboard.nextLine().toUpperCase();
        int wynikArabski = 0;
        int poprzedniZnak = 0;
        for (int i = liczbaRzymska.length() - 1; i >= 0; --i) {
            char znak = liczbaRzymska.charAt(i);
            int wartoscZnaku = 0;
            switch (znak) {
                case 'I':
                    wartoscZnaku = 1;
                    break;
                case 'V':
                    wartoscZnaku = 5;
                    break;
                case 'X':
                    wartoscZnaku = 10;
                    break;
                case 'L':
                    wartoscZnaku = 50;
                    break;
                case 'C':
                    wartoscZnaku = 100;
                    break;
                case 'D':
                    wartoscZnaku = 500;
                    break;
                case 'M':
                    wartoscZnaku = 1000;
                    break;
            }
            if (wartoscZnaku < poprzedniZnak) {
                wynikArabski -= wartoscZnaku;
            } else {
                wynikArabski += wartoscZnaku;
            }
           poprzedniZnak = wartoscZnaku;
        }
        System.out.println("W systemie arabskim wartość wynosi: " + wynikArabski);

        System.out.print("Wpisz liczbę arabską: ");
        int liczbaArabska = keyboard.nextInt();
        while (liczbaArabska >= 4000) {
            System.out.println("Za duża liczba, max 3999");
            System.out.println("Podaj liczbę arabską: ");
            liczbaArabska = keyboard.nextInt();
        }
        String wynikRzymski = "";
        while (liczbaArabska > 0) {
            if (liczbaArabska >= 1000) {
                wynikRzymski += "M";
                liczbaArabska -= 1000;
            } else if (liczbaArabska >= 900) {
                wynikRzymski += "CM";
                liczbaArabska -= 900;
            } else if (liczbaArabska >= 500) {
                wynikRzymski += "D";
                liczbaArabska -= 500;
            } else if (liczbaArabska >= 400) {
                wynikRzymski += "CD";
                liczbaArabska -= 400;
            } else if (liczbaArabska >= 100) {
                wynikRzymski += "C";
                liczbaArabska -= 100;
            } else if (liczbaArabska >= 90) {
                wynikRzymski += "XC";
                liczbaArabska -= 90;
            } else if (liczbaArabska >= 50) {
                wynikRzymski += "L";
                liczbaArabska -= 50;
            } else if (liczbaArabska >= 40) {
                wynikRzymski += "XL";
                liczbaArabska -= 40;
            } else if (liczbaArabska >= 10) {
                wynikRzymski += "X";
                liczbaArabska -= 10;
            } else if (liczbaArabska >= 9) {
                wynikRzymski += "IX";
                liczbaArabska -= 9;
            } else if (liczbaArabska >= 5) {
                wynikRzymski += "V";
                liczbaArabska -= 5;
            } else if (liczbaArabska >= 4) {
                wynikRzymski += "IV";
                liczbaArabska -= 4;
            } else if (liczbaArabska >= 1) {
                wynikRzymski += "I";
                liczbaArabska -= 1;
            }
        }
        System.out.println("Ta liczba w systemie rzymskim to: " + wynikRzymski);
    }
}
