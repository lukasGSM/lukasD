package zadania2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int suma = 0;
        int ilosc = 0;
        System.out.println("Wartość 101 kończy wprowadzanie");
        while (true) {
            System.out.println("Wprowadź wynik procentowy z " + (ilosc + 1) + " testu: ");
            int temp = keyboard.nextInt();
            if (temp >= 0 && temp <= 100) {
                lista.add(temp);
                suma += temp;
                ilosc++;
            } else if (temp == 101) {
                break;
            } else {
                System.out.println("Nieprawidłowa wartość. Wprowadź wynik od 0 do 100");
            }
        }
        if (ilosc > 0) {
            double srednia = (double) suma / ilosc;
            int ocenaKoncowa;
            if (srednia >= 90) {
                ocenaKoncowa = 5;
            } else if (srednia >= 80) {
                ocenaKoncowa = 4;
            } else if (srednia >= 70) {
                ocenaKoncowa = 3;
            } else if (srednia >= 60) {
                ocenaKoncowa = 2;
            } else {
                ocenaKoncowa = 1;
            }
            System.out.println("Ilość testów napisanych przez ciebie: " + ilosc);
            System.out.println("Średnia procentowa z nich to: " + srednia);
            System.out.println("Ocena końcowa to: " + ocenaKoncowa);
            int max = 0;
            int min = 110;
            int najwiekszyPostep = 0;
            int najwiekszySpadek = 0;
            for (int i = 0; i < ilosc; i++) {
                if (lista.get(i) > max) {
                    max = lista.get(i);
                }
                if (lista.get(i) < min) {
                    min = lista.get(i);
                }
                if (i >= 1) {
                    if ((lista.get(i) - lista.get(i - 1)) > najwiekszyPostep) {
                        najwiekszyPostep = (lista.get(i) - lista.get(i - 1));
                    }
                    if ((lista.get(i - 1) - lista.get(i)) > najwiekszySpadek) {
                        najwiekszySpadek = (lista.get(i - 1) - lista.get(i));
                    }
                }
            }
            int najwiekszaRoznica = max - min;
            System.out.println("Najwyższy wynik procentowy: " + max);
            System.out.println("Najniższy wynik procentowy: " + min);
            System.out.println("Największy postęp między dwoma sąsiednimi testami: " + najwiekszyPostep + " punktów procentowych");
            System.out.println("Największy spadek między dwoma sąsiednimi testami: " + najwiekszySpadek + " punktów procentowych");
            System.out.println("Największa różnica pomiędzy wynikami testów: " + najwiekszaRoznica + " punktów procentowych");
        }
    }
}
