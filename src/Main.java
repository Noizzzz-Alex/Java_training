

public class Main {
    /*
    n треугольное и !n
     */

    public static void main(String[] args) {
        int n = 10;
        int tre = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            tre = tre + i;
            fact = fact * i;
        }
        System.out.println(tre);
        System.out.println(fact);
    }


}
