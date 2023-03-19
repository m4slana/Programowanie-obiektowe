import java.util.Scanner;
public class Zad3Lab1 {
        public static void main(String[] args) {
            parzysta();
        }
        public static boolean parzysta(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            int liczba = scanner.nextInt();
            if (liczba %2==0){
                return true;
            }
            else {
                return false;
            }
        }
}
