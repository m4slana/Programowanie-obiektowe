import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println(zadanie1());
        System.out.println(zadanie2());
        System.out.println(zadanie3());
        System.out.println(zadanie4());
        System.out.println(zadanie5());
        System.out.println(zadanie6());
        System.out.println(zadanie7());
    }


    public static String zadanie1() {

        System.out.println("\n------------zadanie1--------------\n");
        int[] tablica = losujLiczby(10, 1, 100);
        int suma = 0;

        System.out.println("Elementy tablicy:");
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
            suma += tablica[i];
        }

        double srednia = (double) suma / tablica.length;

        System.out.println("Suma: " + suma);
        System.out.println("Srednia: " + srednia);

        suma = 0;
        System.out.println("Elementy tablicy (for-each):");
        for (int liczba : tablica) {
            System.out.println(liczba);
            suma += liczba;
        }

        srednia = (double) suma / tablica.length;

        System.out.println("Suma: " + suma);
        System.out.println("Srednia: " + srednia);

        return "koniec zadania";

    }

    public static int[] losujLiczby(int liczbaLiczb, int min, int max) {
        Random rand = new Random();
        int[] tablica = new int[liczbaLiczb];

        for (int i = 0; i < liczbaLiczb; i++) {
            tablica[i] = rand.nextInt(max - min + 1) + min;
        }

        return tablica;
    }


    public static String zadanie2() {
        System.out.println("\n------------zadanie2--------------\n");
        int[] tablicaParzysta = losujLiczby(6, 1, 100);
        int[] tablicaNieparzysta = losujLiczby(5, 1, 100);

        System.out.println("Co drugi element tablicy parzystej:");
        for (int i = 0; i < tablicaParzysta.length; i += 2) {
            System.out.println(tablicaParzysta[i]);
        }

        System.out.println("Co drugi element tablicy nieparzystej:");
        for (int i = 0; i < tablicaNieparzysta.length; i += 2) {
            System.out.println(tablicaNieparzysta[i]);
        }
        return "koniec zadania";
    }


    public static int[] losujLiczbe(int liczbaLiczb, int min, int max) {
        Random rand = new Random();
        int[] tablica = new int[liczbaLiczb];

        for (int i = 0; i < liczbaLiczb; i++) {
            tablica[i] = rand.nextInt(max - min + 1) + min;
        }

        return tablica;
    }


    public static String zadanie3() {

        System.out.println("\n------------zadanie3--------------\n");
        String[] tablica = {"jabłko", "gruszka", "banan", "kiwi"};

        for (String s : tablica) {
            System.out.println(s.toUpperCase());


        }
        return "koniec zadania";
    }


    public static String zadanie4() {
        System.out.println("\n------------zadanie4--------------\n");
        Scanner scanner = new Scanner(System.in);
        String[] slowa = new String[5];

        // pobieranie pięciu słów od użytkownika i zapisywanie ich w tablicy
        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj słowo nr " + (i + 1) + ": ");
            slowa[i] = scanner.nextLine();
        }

        // wypisywanie słów w odwrotnej kolejności z literami od końca do początku
        for (int i = slowa.length - 1; i >= 0; i--) {
            String slowo = slowa[i];
            for (int j = slowo.length() - 1; j >= 0; j--) {
                System.out.print(slowo.charAt(j));
            }
            System.out.print(" ");
        }
        return "koniec zadania";
    }


    public static String zadanie5() {
        System.out.println("\n------------zadanie5--------------\n");
        int[] liczby = new int[8];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj osiem liczb:");

        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = scanner.nextInt();
        }

        sortujRosnaco(liczby);

        System.out.println("Posortowane liczby:");

        for (int liczba : liczby) {
            System.out.print(liczba + " ");
        }
        return "konic zadania";
    }

    public static void sortujRosnaco(int[] tablica) {
        for (int i = 1; i < tablica.length; i++) {
            int aktualnaLiczba = tablica[i];
            int j = i - 1;

            while (j >= 0 && tablica[j] > aktualnaLiczba) {
                tablica[j + 1] = tablica[j];
                j--;
            }

            tablica[j + 1] = aktualnaLiczba;
        }
    }


    public static String zadanie6() {
        System.out.println("\n------------zadanie6--------------\n");
        Scanner scanner = new Scanner(System.in);
        int[] liczby = new int[5];

        System.out.println("Podaj pięć liczb:");

        for (int i = 0; i < 5; i++) {
            liczby[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int liczba = liczby[i];
            int silnia = 1;

            for (int j = 2; j <= liczba; j++) {
                silnia *= j;
            }

            System.out.println("Silnia z liczby " + liczba + " wynosi " + silnia);
        }
        return "koniec zadania";
    }


    public static String zadanie7() {
        System.out.println("\n------------zadanie7--------------\n");
        String[] pierwszaTablica = {"Ala", "ma", "kota"};
        String[] drugaTablica = {"Ala", "ma", "kota"};

        boolean czyTakieSame = Arrays.equals(pierwszaTablica, drugaTablica);

        if (czyTakieSame) {
            System.out.println("Tablice są takie same.");
        } else {
            System.out.println("Tablice nie są takie same.");
        }
        return "koniec zadania";
    }
}