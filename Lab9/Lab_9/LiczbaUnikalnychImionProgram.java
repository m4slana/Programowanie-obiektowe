import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LiczbaUnikalnychImionProgram {
    public static void main(String[] args) {
        Set<String> imiona = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź imiona (wprowadź '-' aby zakończyć):");

        while (true) {
            String imie = scanner.nextLine();

            if (imie.equals("-")) {
                break;
            }

            imiona.add(imie);
        }

        System.out.println("Liczba unikalnych imion: " + imiona.size());
    }
}
