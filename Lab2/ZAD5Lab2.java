public class ZAD5Lab2 {

        public static void main(String[] args) {
            licznik();
        }
        public static void licznik(){
            for (int i = 20; i >= 0; i--) {
                if (i == 19 || i == 15 || i == 9 || i == 6 || i == 2 ) {
                    continue;
                }
                System.out.println(+i);

            }

        }
}
