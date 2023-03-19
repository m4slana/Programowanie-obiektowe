import java.util.Scanner;
import java.lang.Math;
public class ZAD1Lab2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe znajfująca się przy x^2");
        double a = scanner.nextDouble();
        System.out.println("Podaj liczbe znajdujaca sie przy x");
        double b = scanner.nextDouble();
        System.out.println("Podaj liczbe wolna");
        double c = scanner.nextDouble();

        double delta = b * b -4 * a * c;

        if (delta<0){
            System.out.println("Brak rozwiązan");
        }
        else if (delta==0) {
            double x = -b/(2*a);
            System.out.println("Pierwiastek wynosi" +x);
        }
        else {
            double x1 = (-b - Math.sqrt(delta))/(2*a);
            double x2 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("Pierwiastki wynoszą" +x1+ "i" +x2);
        }

    }

}

