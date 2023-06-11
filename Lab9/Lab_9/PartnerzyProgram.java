import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PartnerzyProgram {
    public static void main(String[] args) {
        Map<String, String> partnerzy = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź imiona par (wprowadź '-' aby zakończyć):");

        while (true) {
            String imie1 = scanner.nextLine();

            if (imie1.equals("-")) {
                break;
            }

            String imie2 = scanner.nextLine();
            partnerzy.put(imie1, imie2);
        }

        System.out.println("Wprowadź imię jednego z partnerów:");
        String imie = scanner.nextLine();

        if (partnerzy.containsKey(imie)) {
            String partner = partnerzy.get(imie);
            System.out.println("Partner dla " + imie + ": " + partner);
        } else {
            System.out.println("Nie znaleziono partnera dla podanego imienia.");
        }
    }
}
