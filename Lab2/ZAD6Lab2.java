import java.util.Scanner;
public class ZAD6Lab2 {

        public static void main(String[] args) {
            infloop();
        }
        public static void infloop(){
            for (;;) {
                Scanner input = new Scanner(System.in);
                System.out.println("podaj liczne");
                int loop = input.nextInt();
                if (loop <0){
                    break;
                }

            }
        }
}
