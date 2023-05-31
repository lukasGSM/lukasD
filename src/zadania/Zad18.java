package zadania;



public class Zad18 {
    public static void main(String[] args) {
        final int ILOSCAKCJI = 600;
        final double CENAAKJI = 21.77;
        double kwotaZaAkcje = ILOSCAKCJI * CENAAKJI;
        double prowizja = kwotaZaAkcje * 0.02;
        double zaplaconaKwota = kwotaZaAkcje + prowizja;
        System.out.println("Pieniądze wydane na same akcje: " + kwotaZaAkcje);
        System.out.println("Wartość prowizji: " + prowizja);
        System.out.println("Łącznie wydana kwota: " + zaplaconaKwota);
    }
}
