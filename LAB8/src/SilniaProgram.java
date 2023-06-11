class BlednaWartoscDlaSilniException extends Exception {
    public BlednaWartoscDlaSilniException(String message) {
        super(message);
    }
}

public class SilniaProgram {
    public static int silnia(int n) throws BlednaWartoscDlaSilniException {
        if (n < 0) {
            throw new BlednaWartoscDlaSilniException("Nie można obliczyć silni dla liczby ujemnej: " + n);
        }

        if (n == 0) {
            return 1;
        }

        int wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }

        return wynik;
    }

    public static void main(String[] args) {
        int liczba = -5;

        try {
            int wynik = silnia(liczba);
            System.out.println("Silnia z " + liczba + " wynosi: " + wynik);
        } catch (BlednaWartoscDlaSilniException e) {
            System.out.println(e.getMessage());
        }
    }
}