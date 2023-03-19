import java.util.Scanner;
public class Zad4Lab1 {
    public static void main(String[] args) {
        podzielna();
    }
    public static boolean podzielna(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int liczba = scanner.nextInt();
        if (liczba %3==0 && liczba %5==0){
            return true;
        }
        else {
            return false;
        }
    }

}