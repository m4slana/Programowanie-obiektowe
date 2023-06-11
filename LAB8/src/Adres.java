import java.util.ArrayList;
import java.util.List;

class NieprawidlowyAdresException extends Exception {
    private List<String> nieprawidloweWartosci;

    public NieprawidlowyAdresException(List<String> nieprawidloweWartosci) {
        super("Następujące wartości adresu są nieprawidłowe: " + nieprawidloweWartosci.toString());
        this.nieprawidloweWartosci = nieprawidloweWartosci;
    }

    public List<String> getNieprawidloweWartosci() {
        return nieprawidloweWartosci;
    }
}

public class Adres {
    private String ulica;
    private int numerDomu;
    private String kodPocztowy;
    private String miasto;

    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto) throws NieprawidlowyAdresException {
        List<String> nieprawidloweWartosci = new ArrayList<>();

        if (ulica == null) {
            nieprawidloweWartosci.add("Ulica nie może być nullem.");
        }

        if (numerDomu <= 0) {
            nieprawidloweWartosci.add("Numer domu musi być liczbą dodatnią.");
        }

        if (kodPocztowy == null) {
            nieprawidloweWartosci.add("Kod pocztowy nie może być nullem.");
        }

        if (miasto == null) {
            nieprawidloweWartosci.add("Miasto nie może być nullem.");
        }

        if (!nieprawidloweWartosci.isEmpty()) {
            throw new NieprawidlowyAdresException(nieprawidloweWartosci);
        }

        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    public static void main(String[] args) {
        try {
            Adres adres = new Adres(null, -1, null, null);
            System.out.println("Adres poprawny: " + adres);
        } catch (NieprawidlowyAdresException e) {
            System.out.println(e.getMessage());
            System.out.println("Nieprawidłowe wartości: " + e.getNieprawidloweWartosci());
        }
    }
}
