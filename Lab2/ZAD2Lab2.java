import java.util.Scanner;
import java.lang.Math;
public class ZAD2Lab2 {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Podaj liczby i działanie +, -, *, /, ^, sqrt, sin, cos, tg, ctg");
     System.out.println("Jeśli to pierwisatkowanie lub funkcje trygonometryczne program weźmie pod uwagę tylko 1 liczbę");

        System.out.println("Pierwsza liczba:");
        double a = scanner.nextDouble();
        System.out.println("Druga liczba:");
        double b = scanner.nextDouble();
        System.out.println("Działanie");
        String dzialanie = scanner.next();
        double wynik = 0;

        switch (dzialanie){
            case "+":
                wynik = a + b;
                break;
            case "-":
                wynik = a - b;
                break;
            case "*":
                wynik = a * b;
                break;
            case "/":
                wynik = a/b;
                break;
            case "^":
                wynik = Math.pow(a,b);
                break;
            case "sqrt":
                wynik = Math.sqrt(a);
                break;
            case "sin":
                wynik = Math.sin(a);
                break;
            case "cos":
                wynik = Math.cos(a);
                break;
            case "tg":
                wynik = Math.tan(a);
                break;
            case "ctg":
                wynik = 1/Math.tan(a);
                break;

        }
        System.out.println("wynik to" +wynik);
    }

}
