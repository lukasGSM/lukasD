package zadania;

public class Zad22 {
    public static void main(String[] args) {
        final int LICZBAKUPIONYCHAKCJI = 1000;
        final double CENAZAKUPUAKCJI = 32.87;
        final double CENASPRZEDAZYAKCJI = 33.92;
        double kwotaZakupu = LICZBAKUPIONYCHAKCJI * CENAZAKUPUAKCJI;
        double prowizjaZakupu = kwotaZakupu * 0.02;
        double kwotaSprzedazy = LICZBAKUPIONYCHAKCJI * CENASPRZEDAZYAKCJI;
        double prowizjaSprzedazy = kwotaSprzedazy * 0.02;
        double zyskOstateczny = kwotaSprzedazy - kwotaZakupu - prowizjaSprzedazy - prowizjaZakupu;
        System.out.println("Kwota wydana na akcje: " + kwotaZakupu);
        System.out.println("Prowizja zakupu: " + prowizjaZakupu);
        System.out.println("Kwota uzyskana za sprzedaz: " + kwotaSprzedazy);
        System.out.println("Prowizja sprzedazy: " + prowizjaSprzedazy);
        System.out.println("Ostateczny zysk: " + zyskOstateczny);
    }
}
