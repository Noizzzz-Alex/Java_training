

public class Main {
    /*
    Вывести все простые числа от 1 до 1000
     */

    public static void main(String[] args) {
        int n = 1000;


        for (int i = 1; i <= n; i++) {
            int counter = 0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.printf("%d, ", i);
            }


        }
    }


}
