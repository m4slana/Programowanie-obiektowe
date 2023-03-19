import java.util.Scanner;
import java.lang.Math;
public class Zad5Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int liczba = scanner.nextInt();
        double potega = Math.pow(liczba, 3);
        System.out.println("Liczba" +liczba+ "podniesiona do 3 potegi to " +potega);
    }
}