

public class Main {
    /*
    n треугольное и !n
     */

    public static void main(String[] args) {
        int n = 5;
        int tre = (n * (n+1))/2;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(tre);
        System.out.println(fact);
    }


}
