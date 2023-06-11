import java.util.Scanner;

public class PierwiastekProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        String input = scanner.nextLine();

        try {
            double number = Double.parseDouble(input);

            if (number < 0) {
                throw new IllegalArgumentException("Podana liczba musi być dodatnia.");
            }

            double squareRoot = Math.sqrt(number);
            System.out.println("Pierwiastek z liczby " + number + " wynosi: " + squareRoot);
        } catch (NumberFormatException e) {
            System.out.println("Podana wartość nie jest liczbą.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}