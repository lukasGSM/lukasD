package ZadaniaPetle;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zad23 {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        FileWriter fw = new FileWriter("index.html", false);
        PrintWriter pw = new PrintWriter(fw);
        int decyzja1, koniec = 0, rozmiarCzcionki = 16;
        String kolorTla = "", kolorCzcionki = "", krojCzcionki = "", zawartosc = "", doWyswietlenia;
        while (true) {
            System.out.println("Co chciałbyś zmienić na stronie? Wprowadź liczbę (0 kończy działanie i zapisuje plik) \n" +
            "1. Zmienić wygląd\n" +
            "2. Dodać zawartość\n"
            );
            decyzja1 = keyboard.nextInt();
            switch (decyzja1) {
                case 1:
                    System.out.println("Wprowadź liczbę\n" +
                    "1. Zmień kolor tła \n" +
                    "2. Zmień kolor tekstu\n" +
                    "3. Zmień krój czcionki\n" +
                    "4. Zmień rozmiar tekstu\n"
                    );
                    int decyzja2 = keyboard.nextInt();
                    switch (decyzja2) {
                        case 1:
                            System.out.println("Kolor tła (wprowadź liczbę)\n" +
                            "1. Czerwony\n" +
                            "2. Niebieski\n" +
                            "3. Czarny\n" +
                            "4. Biały\n" +
                            "5. Zielony\n"
                            );
                            int decyzja3 = keyboard.nextInt();
                            switch (decyzja3) {
                                case 1:
                                    kolorTla = "red";
                                    break;
                                case 2:
                                    kolorTla = "blue";
                                    break;
                                case 3:
                                    kolorTla = "black";
                                    break;
                                case 4:
                                    kolorTla = "white";
                                    break;
                                case 5:
                                    kolorTla = "green";
                                    break;
                                default:
                                    kolorTla = "white";
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Kolor czcionki (wprowadź liczbę)\n" +
                                    "1. Czerwony\n" +
                                    "2. Niebieski\n" +
                                    "3. Czarny\n" +
                                    "4. Biały\n" +
                                    "5. Zielony\n"
                            );
                            decyzja3 = keyboard.nextInt();
                            switch (decyzja3) {
                                case 1:
                                    kolorCzcionki = "red";
                                    break;
                                case 2:
                                    kolorCzcionki = "blue";
                                    break;
                                case 3:
                                    kolorCzcionki = "black";
                                    break;
                                case 4:
                                    kolorCzcionki = "white";
                                    break;
                                case 5:
                                    kolorCzcionki = "green";
                                    break;
                                default:
                                    kolorCzcionki = "black";
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Krój czcionki (wprowadź liczbę)\n" +
                                    "1. Arial\n" +
                                    "2. Times New Roman\n" +
                                    "3. Tahooma\n" +
                                    "4. Verdana\n" +
                                    "5. Bahnschrift\n"
                            );
                            decyzja3 = keyboard.nextInt();
                            switch (decyzja3) {
                                case 1:
                                     krojCzcionki = "'Arial'";
                                    break;
                                case 2:
                                    krojCzcionki = "'Times New Roman'";
                                    break;
                                case 3:
                                    krojCzcionki = "'Tahooma'";
                                    break;
                                case 4:
                                    krojCzcionki = "'Verdana'";
                                    break;
                                case 5:
                                    krojCzcionki = "'Bahnschrift'";
                                    break;
                                default:
                                    krojCzcionki = "'Arial'";
                                    break;
                            }
                            break;
                        case 4:
                            int rozmiar = 0;
                            while (rozmiar < 1) {
                                System.out.println("Podaj rozmiar czcionki w pixelach (liczba całkowita)");
                                rozmiar = keyboard.nextInt();
                            }
                            rozmiarCzcionki = rozmiar;
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Wprowadź liczbę\n" +
                            "1. Dodaj nagłówek \n" +
                            "2. Dodaj paragraf\n" +
                            "3. Dodaj krótki jednolinijkowy tekst\n"
                    );
                    decyzja2 = keyboard.nextInt();
                    String temp;
                    keyboard.nextLine();
                    System.out.println("Wprowadź zawartość");
                    temp = keyboard.nextLine();
                    switch (decyzja2) {
                        case 1:
                            System.out.println("Formatowanie (wybierz liczbę)\n" +
                            "1. Pogrubiebie\n" +
                            "2. Podkreślenie\n" +
                            "3. Kursywa\n" +
                            "4. Brak"
                            );
                            int decyzja3 = keyboard.nextInt();
                            switch (decyzja3) {
                                case 1:
                                    zawartosc += "<h1><b>" + temp + "</b></h1>";
                                    break;
                                case 2:
                                    zawartosc += "<h1><u>" + temp + "</u></h1>";
                                    break;
                                case 3:
                                    zawartosc += "<h1><i>" + temp + "</i></h1>";
                                    break;
                                case 4:
                                    zawartosc += "<h1>" + temp + "</h1>";
                                    break;
                                default:
                                    zawartosc += "<h1>" + temp + "</h1>";
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Formatowanie (wybierz liczbę)\n" +
                                    "1. Pogrubiebie\n" +
                                    "2. Podkreślenie\n" +
                                    "3. Kursywa\n" +
                                    "4. Brak"
                            );
                            decyzja3 = keyboard.nextInt();
                            switch (decyzja3) {
                                case 1:
                                    zawartosc += "<p><b>" + temp + "</b></p>";
                                    break;
                                case 2:
                                    zawartosc += "<p><u>" + temp + "</u></p>";
                                    break;
                                case 3:
                                    zawartosc += "<p><i>" + temp + "</i></p>";
                                    break;
                                case 4:
                                    zawartosc += "<p>" + temp + "</p>";
                                    break;
                                default:
                                    zawartosc += "<p>" + temp + "</p>";
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Formatowanie (wybierz liczbę)\n" +
                                    "1. Pogrubiebie\n" +
                                    "2. Podkreślenie\n" +
                                    "3. Kursywa\n" +
                                    "4. Brak"
                            );
                            decyzja3 = keyboard.nextInt();
                            switch (decyzja3) {
                                case 1:
                                    zawartosc += "<span><b>" + temp + "</b></span>";
                                    break;
                                case 2:
                                    zawartosc += "<span><u>" + temp + "</u></span>";
                                    break;
                                case 3:
                                    zawartosc += "<span><i>" + temp + "</i></span>";
                                    break;
                                case 4:
                                    zawartosc += "<span>" + temp + "</span>";
                                    break;
                                default:
                                    zawartosc += "<span>" + temp + "</span>";
                                    break;
                            }
                            break;
                    }
                    break;
                case 0:
                    koniec = 1;
                    break;
                default:
                    continue;
            }
            doWyswietlenia = "<html>" +
                    "<head>" +
                    "<title>Moja strona</title>" +
                    "<meta charset='utf=8'>" +
                    "<style>" +
                    "body {" +
                    "background-color: " + kolorTla + ";" +
                    "color: " + kolorCzcionki + ";" +
                    "font-family: " + krojCzcionki + ";" +
                    "font-size: " + rozmiarCzcionki + ";" +
                    "}" +
                    "</style>" +
                    "</head>" +
                    "<body>" +
                    zawartosc +
                    "</body>" +
                    "</html>";
            if (koniec == 1) {
                break;
            }
        }
        fw.write(doWyswietlenia);
        fw.close();
    }
}
