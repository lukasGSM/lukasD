package zadania;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Zad19 {
    public static void main(String[] args) {
        final int liczbaAnkietowanych = 12467;
        BigDecimal bd = new BigDecimal(liczbaAnkietowanych * 0.14).setScale(0, RoundingMode.DOWN);
        double kupujacyEnergetyki = bd.intValue();
        BigDecimal bd2 = new BigDecimal(kupujacyEnergetyki * 0.64).setScale(0, RoundingMode.DOWN);
        double cytrusowe = bd2.intValue();
        System.out.println("Przybliżona liczba osób kupujących co najmniej jeden napój tygodniowo: " +kupujacyEnergetyki);
        System.out.println("Przbliżona liczba osób wybierających smaki cytrusowe: " + cytrusowe);
    }
}
